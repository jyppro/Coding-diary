package com.dbshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	String poolUrl = "com.mysql.cj.jdbc.Driver";

	private void freeConnection(ResultSet r, PreparedStatement p, Connection c) {
		try {
			if (r != null)
				r.close();
			if (p != null)
				p.close();
			if (c != null)
				c.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	private void freeConnection(PreparedStatement p, Connection c) {
		try {
			if (p != null)
				p.close();
			if (c != null)
				c.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	// ---------------------------------------------------------------------------------
	
	public int insertUser(UsersDto dto) {
		try {
			conn = DriverManager.getConnection(poolUrl);
			String sql = "INSERT INTO users VALUES (NULL,?,?,?,?,?,?,?,?,DEFAULT,DEFAULT,now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getZipCode());
			pstmt.setString(6, dto.getAddress());
			pstmt.setString(7, dto.getAddress2());
			pstmt.setString(8, dto.getPhone());
			result = pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			freeConnection(pstmt, conn);
		}
		return result;
	}

	// ----------------------------------------------------------------------------
	public boolean pwChk(String idx, String id, String pw) {
		boolean result = false;
		try {
			conn = DriverManager.getConnection(poolUrl);
			String sql = "select count(idx) from users where idx=? and id=? and pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(idx));
			pstmt.setString(2, id);
			pstmt.setString(3, pw);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getInt(1) > 0) {
					result = true;
				}
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			freeConnection(rs, pstmt, conn);
		}
		return result;
	}

	// --------------------------------------------------------------------
	public UsersDto getMyInfo(String id) {
		UsersDto usersDto = new UsersDto();
		try {
			conn = DriverManager.getConnection(poolUrl);
			String sql = "select * from users where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				usersDto.setIdx(rs.getInt(1));
				usersDto.setId(rs.getString(2));
				usersDto.setPw(rs.getString(3));
				usersDto.setName(rs.getString(4));
				usersDto.setEmail(rs.getString(5));
				usersDto.setZipCode(rs.getString(6));
				usersDto.setAddress(rs.getString(7));
				usersDto.setAddress2(rs.getString(8));
				usersDto.setPhone(rs.getString(9));
				usersDto.setUseyn(rs.getInt(10));
				usersDto.setLv(rs.getInt(11));
				usersDto.setRegedate(rs.getString(12));
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			freeConnection(rs, pstmt, conn);
		}
		return usersDto;
	}

	// --------------------------------------------------------
	public UsersDto login(String id, String pw) {
		UsersDto usersDto = new UsersDto();
		try {
			conn = DriverManager.getConnection(poolUrl);
			String sql = "select * from users where id=? and pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				usersDto.setIdx(rs.getInt(1));
				usersDto.setId(rs.getString(2));
				usersDto.setName(rs.getString(4));
				usersDto.setEmail(rs.getString(5));
				usersDto.setZipCode(rs.getString(6));
				usersDto.setAddress(rs.getString(7));
				usersDto.setAddress2(rs.getString(8));
				usersDto.setPhone(rs.getString(9));
				usersDto.setUseyn(rs.getInt(10));
				usersDto.setLv(rs.getInt(11));
				usersDto.setRegedate(rs.getString(12));
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			freeConnection(rs, pstmt, conn);
		}
		return usersDto;
	}

	// -------------------------------------------------------------------------
	public int updateUsers(UsersDto usersDto) {
		try {
			conn = DriverManager.getConnection(poolUrl);
			String sql = "update users set pw=?, email=?, zipCode=?, address=?, address2=?, phone=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, usersDto.getPw());
			pstmt.setString(2, usersDto.getEmail());
			pstmt.setString(3, usersDto.getZipCode());
			pstmt.setString(4, usersDto.getAddress());
			pstmt.setString(5, usersDto.getAddress2());
			pstmt.setString(6, usersDto.getPhone());
			pstmt.setString(7, usersDto.getId());

			result = pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			freeConnection(pstmt, conn);
		}
		return result;
	}

	// --------------------------------------------------------------------
	public int deleteUsers(String id) {
		try {
			conn = DriverManager.getConnection(poolUrl);
			String sql = "update users set useyn=2 where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			freeConnection(pstmt, conn);
		}
		return result;
	}
}
