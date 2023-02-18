<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>

<h2> 회원가입</h2>
<form action="insert.do" method="post">
	아이디 : <input type="text" name="id"><br>
	비번 : <input type="text" name="password"><br>
	이름 : <input type="text" name="name"><br>
	이메일 : <input type="text" name="email"><br>
	핸드폰번호 : <input type="text" name="phone"><br>
	주소 : <input type="text" name="address"><br>
	직장 : <input type="text" name="job"><br>
	<input type="submit" value="삽입">
</form>

</body>
</html>