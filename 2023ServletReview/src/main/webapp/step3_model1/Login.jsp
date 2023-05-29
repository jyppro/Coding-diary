<%@ page contentType="text/html;charset=UTF-8"%>
<%
	String mem_id = (String)session.getAttribute("idKey");
	
	String log="";
	if(mem_id == null) log ="<a href=Login.jsp> 로그인 </a>";
	else log = "<a href=Logout.jsp> 로그아웃 </a>";

	String mem="";
	if(mem_id == null) mem ="<a href=Register.jsp> 회원 등록 </a>";
	else mem = "<a href=MemberUpdate.jsp> 회원 수정 </a>";
%>
<html>
<head>
<title>모델 1 예제 (로그인)</title>

</head>
<body >
<h1> MVC의 모델 1 </h1>

<%=log%> <%=mem%>
<br><br>
	
		<form method="post" action="LoginProc2.jsp">
		<table width="50%" border="1" align="center">
		<tr bordercolor="#FFFF66"> 
		<td colspan="2" align="center">로그인</td>
		</tr>
		<tr > 
		<td width="47%" align="center">ID</td>
		<td width="53%" align="center"><input type="text" name="id"></div></td>
		</tr>
		<tr> 
		<td align="center">Password</td>
		<td align="center"><input type="text" name="password"></td>
		</tr>
		<tr> 
		<td colspan="2" align="center"><input type="submit" value="login">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
		<input type="reset" value="reset">
		</td>
		</tr>
		</table>
		</form>
		

	
</body>
</html>