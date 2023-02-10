package mallPack;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insert.do")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String i = request.getParameter("id");
		String p = request.getParameter("password");
		RegisterDTO rd = new RegisterDTO();
		rd.setId(i);
		rd.setPassword(p);
		RegisterDAO rt = new RegisterDAO();
		try {
			rt.insertMember(rd);
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("insertSucess.jsp");
		dispatcher.forward(request, response);
	}

}
