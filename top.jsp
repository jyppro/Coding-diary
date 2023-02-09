<%@page import="java.awt.Checkbox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String loginCheck = (String)session.getAttribute("memberId");
	String loginId = (String)session.getAttribute("idName");
	String check = (String)session.getAttribute("memSave");
	String idStr=null, pwStr=null, checkStr=null;
	
	if(check==null){
		idStr = ""; pwStr=""; checkStr="";
	}else{
		idStr = "id"; pwStr="pw"; checkStr="checked";
	}
	
	if(loginCheck == null){
		//로그인 하기 전
%>
		<form action="module/loginProcess.jsp" method="post">
			아이디 : <input type="text" name="id" value=<%= idStr %>>
			비밀번호 : <input type="text" name="pw" value=<%= pwStr %>>
			<input type="submit" value="확인"><br>
			<input type="checkbox" name="idSave" value=<%= checkStr %>> 아이디/비번 저장
		</form>

<%
	}else{
		//로그인 한 후
%>
		<h2><%=loginId %> 님, 환영합니다!</h2>
		<form action="module/logoutProcess.jsp" method="post">
			<input type="submit" value="로그아웃">
		</form>
<%
	}
%>
</body>
</html>