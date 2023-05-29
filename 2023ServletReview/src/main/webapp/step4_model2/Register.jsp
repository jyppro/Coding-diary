<%@ page contentType="text/html;charset=UTF-8"%>
<%
	String mem_id = (String)session.getAttribute("idKey");
	
	String log="";
	if(mem_id == null) log ="<a href=Login.jsp> 로그인 </a>";
	else log = "<a href=/2022PolyB/logout.do> 로그아웃 </a>";

	String mem="";
	if(mem_id == null) mem ="<a href=Register.jsp> 회원 등록 </a>";
	else mem = "<a href=#> 회원 수정 </a>";
%>
<html>
<head>
<title>모델 2 예제 (회원가입)</title>

</head>
<body>
<h1> MVC의 모델 2 </h1>

<%=log%> <%=mem%>

<br><br>
		<table width="70%"  border="1">
		<form name="regForm" method="get" action="/2023ServletReview/register.do">
		<tr align="center" bgcolor="#996600"> 
		<td colspan="2"><font color="#FFFFFF"><b>회원 가입</b></font></td>
		</tr>
		<tr> 
		<td width="30%">아이디</td>
		<td width="70%"><input type="text" name="id" size="15">
		<input type="button" value="ID중복확인" onClick="idCheck(this.form.mem_id.value)">
		</td>
		</tr>
		<tr> 
		<td>패스워드</td>
		<td><input type="password" name="password" size="15"></td>
		</tr>
		<tr> 
		<td>패스워드 확인</td>
		<td><input type="password" name="RePassword" size="15"> </td>
		</tr>
		<tr> 
		<td>이름</td>
		<td><input type="text" name="name" size="15"> </td>
		</tr>
		<tr>  
		<td>역할</td>
		<td><select name=role>
		<option value="0">선택하세요.
		<option value="관리자">관리자
		<option value="일반">일반
		</select>
		</td>
		</tr>
		<tr> 
		<td colspan="2" align="center"> 
		<input type="submit" value="회원가입" > 		 
		<input type="reset" value="다시쓰기"> 
		</td>
		</tr>
		</form>
		</table>
		
	</td>
	</tr>
	</table>



		

	
</body>
</html>