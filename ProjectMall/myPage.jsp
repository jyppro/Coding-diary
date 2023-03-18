<%@page import="com.dbshop.Dao"%>
<%@page import="com.dbshop.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<style>
body {
   margin: 0px;
   
}

#containAll {
   width: 100%;
   margin: 0 auto;  
}

#container {
   width: 460px;
   margin: 0 auto;
}

#container>table {
   margin: 0 auto;
   background: white;
   width: 100%;
   height: 800;
   border: 1px solid #gray;
}

#container>table tr {
   border-bottom: 2px solid #ccc;
}

#container>table>tr td {
   padding: 20px;
   font-size: 40px;
}

#container>h1 {
   text-align: center;
   color: gray;
   font-size: 80px;
   font-weight: bold;
}

.myButton {
   width: 100%;
   height: 55px;
   border: none;
   font-size: 20px;
   color: #fff;
   background-color: lightgray;
   margin-top: 5px;
   margin-bottom: 5px;
}
</style>
</head>

<body>
<jsp:include page="top.jsp"/>
<c:if test="${sessionScope.userInfo == null}">
   <script>
        alert("로그인이 필요한 페이지 입니다.");
        location.replace("Login.do");
    </script>    
</c:if>

   <div id="containAll">

      <div id="container">
         <h1>My Page</h1><br><br>
         <table>
         	
            
            <tr>
               <td>아이디</td>
               <td>${usersDto.id}</td>
            </tr>

            <tr>
               <td>이름</td>
               <td>${usersDto.name}</td>
            </tr>
            <tr>
               <td>이메일</td>
               <td>${usersDto.email}</td>
            </tr>

            <tr>
               <td>주소</td>
               <td>${usersDto.address} ${usersDto.address2}</td>
            </tr>
            <tr>
               <td colspan="2">
               <input class="myButton" type="button" value="회원정보 수정" onclick="location.href='UsersUpdate.do'" /></td>
            </tr>
            <tr>
               <td colspan="2">
               <input class="myButton" type="button" value="회원 탈퇴" onclick="location.href='UsersDeleteProc.do'" /></td>
            </tr>
            <tr>
               <td colspan="2">
               <input class="myButton" type="button" value="장바구니" onclick="location.href='Cart.do'" /></td>
            </tr>
            
         </table>
      </div>
   </div>
<jsp:include page="footer.jsp"/>
</body>
</html>