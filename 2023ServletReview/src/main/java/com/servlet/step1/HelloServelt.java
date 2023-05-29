package com.servlet.step1;

// 패키지 import
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/hi")
public class HelloServelt extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get 방식으로");
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String op;

		java.util.Date d = new java.util.Date();  
		op = d.toString();
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>계산기</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h1> 서블릿으로 만든 페이지 </h1>");
		out.println("<H4> 오늘의 날짜는 " + op + "입니다.</H4>");
		out.println("<HR>");
		out.println("</BODY></HTML>");
	}
	

}