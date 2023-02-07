<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String i = request.getParameter("id");
	String p = request.getParameter("pw");
	
	if (i.equals("dong") && p.equals("123")){
		//로그인 성공
		session.setAttribute("memberId", "ok");
		session.setAttribute("idName", i);
		response.sendRedirect("../template.jsp");
	}else{
		//로그인 실패
		response.sendRedirect("../template.jsp");
	}
%>