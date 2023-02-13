package mallPack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisterDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	final String USER_INSERT = "insert into members values(?,?,?,?,?,?,?); ";
	final String USER_LIST = "select * from members; ";

	public void insertMember(RegisterDTO mem) throws SQLException {
		try{
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(USER_INSERT);
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPassword());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getEmail());
			pstmt.setString(5, mem.getPhone());
			pstmt.setString(6, mem.getAddress());
			pstmt.setString(7, mem.getJob());
			pstmt.executeUpdate();
			
		}catch(Exception e){
			
		}finally{
			JDBCutil.close(pstmt, conn);
		}
	}
	
	
	public ArrayList<RegisterDTO> selectMemberList()  throws SQLException {

		ArrayList<RegisterDTO>aList = new ArrayList<RegisterDTO>();
		ResultSet rs = null;
		try{
			conn = JDBCutil.getConnection();
			pstmt = conn.prepareStatement(USER_LIST);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				RegisterDTO rd = new RegisterDTO();
				rd.setId( rs.getString("id") );
				rd.setPassword( rs.getString("password") );
				rd.setName( rs.getString("name") );
				rd.setEmail( rs.getString("email") );
				rd.setPhone( rs.getString("phone") );
				rd.setAddress( rs.getString("address") );
				rd.setJob( rs.getString("job") );
				aList.add(rd);
			}
		}catch(Exception e){
			
		}finally{
			JDBCutil.close(rs, pstmt, conn);
		}
		return aList;
	}
}
