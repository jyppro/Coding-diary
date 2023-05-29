<%@ page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="memDao" class="com.servlet.step3.MemberDAO" />
<%
	String mem_id = request.getParameter("id");
	String mem_passwd = request.getParameter("password");
	boolean loginCheck = memDao.loginCheck(mem_id, mem_passwd); 
%>
<%
   if(loginCheck){
	  session.setAttribute("idKey",mem_id);
	  response.sendRedirect("Index.jsp");
   }else{
      response.sendRedirect("LogError.jsp");
   }
%>

