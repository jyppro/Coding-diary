<%@ page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="memDao" class="com.servlet.step3.MemberDAO" />

<jsp:useBean class="com.servlet.step3.MemberDTO" id="mem" scope="session" />
<jsp:setProperty name="mem" property="*" />
<%
	boolean loginCheck = memDao.loginCheck(mem.getId(), mem.getPassword() ); 
%>
<%
   if(loginCheck){
	  session.setAttribute("idKey",mem.getId());
	  response.sendRedirect("Index.jsp");
   }else{
      response.sendRedirect("LogError.jsp");
   }
%>

