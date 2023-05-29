<%@ page contentType="text/html;charset=UTF-8"%>
<%
	String mem_id = (String)session.getAttribute("idKey");
	
	String log="";
	if(mem_id == null) log ="<a href=Login.jsp> 로그인 (모델2)</a>";
	else log = "<a href=/2022PolyB/logout.do> 로그아웃 (모델2)</a>";

	String mem="";
	if(mem_id == null) mem ="<a href=Register.jsp> 회원 등록 (모델2) </a>";
	else mem = "<a href=#> 회원 수정 </a>";
%>
<html>
<head>
<title>모델 2 예제 </title>
</head>

<body>
<h1> MVC의 모델 2 </h1>

[<%=log%>]  [ <%=mem%>]

<br><br>
	<%
	if(mem_id != null){
	%>
		<%=mem_id%>님 방문해 주셔서 감사합니다. 
	<%}else{%>
		로그인 하신 후 이용해 주세요
	<%}%>



</body>
</html>  
  