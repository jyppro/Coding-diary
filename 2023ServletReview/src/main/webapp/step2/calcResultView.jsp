<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean class="com.servlet.step2.NumberDTO" id="numBean" scope="session" />
<jsp:setProperty name="numBean" property="*" />

<!DOCTYPE>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getParameter("n1")  %> <br>
<%=numBean.getN1()  %>  <%=numBean.getOperator()  %> <%=numBean.getN2()  %>는
<%=request.getAttribute("result")%>입니다.

</body>
</html>