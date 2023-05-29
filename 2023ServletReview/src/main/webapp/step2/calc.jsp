<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H3>계산기</H3>
<HR>
<form action="/2023ServletReview/calcServlet" method=get>
	<INPUT TYPE="text" NAME="n1" width=200 size="5">
	<SELECT NAME="operator"> 
		<option selected>+</option>
		<option>-</option>
		<option>*</option>
		<option>/</option>
	</SELECT>
	<INPUT TYPE="text" NAME="n2" width=200 size="5"> 
	<input type="submit" value="계산" name="B1"> <input type="reset" value="다시입력" name="B2">
</form>

</body>
</html>