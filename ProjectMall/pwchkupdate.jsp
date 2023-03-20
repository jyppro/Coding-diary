<%@page import="com.dbshop.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
   #wrap{
      width: 100%;
      margin: 0 auto;
      text-align: center;
   }
   .center_box {
       /* border: 1px solid blue; */
       margin:0 auto;
       width: 1500px;
       height: 100%;

    }
    .center_box > h1 {
       text-align: center;
       margin-top: 10px;
    }
    .info-form {
        width: 100%;
        margin-top: 50px;
        padding: 20px;
        border: none;
    }
    .text-field {
       	font-size: 20px;
        padding: 20px;
        color: #9B9B9B;
        width: 400px;
        margin-bottom: 10px;
    }
    .right_input {
       	width: 100%;
        /* border: 1px solid green; */
        text-align: center;
        min-height: 100px;
     }
     .right_input input {
        font-size: 30px;
     }
     .right_input span {
        font-size: 15px;
        color:black;
     }
   .pwch_btn{
         width: 150px;
         height: 50px;
         margin: 0 auto;
         background-color: lightgray;
         font-size: 20px;
         font-weight: 300;
         color: white;
         cursor: pointer;
      }
</style>
</head>
<body>
<%
   UsersDto usersDto = (UsersDto)session.getAttribute("userInfo");
%>
<jsp:include page="top.jsp"/>
  <c:if test="${sessionScope.userInfo == null}">
   	<script>
        alert("로그인이 필요한 페이지 입니다.");
        location.replace("Login.do");
    </script>    
  </c:if>
     
   <div id="wrap">
   <div class="center_box">
        <h1>비밀번호 확인</h1><br>
        <div class="info-form">
         <form name="frm" action="MyPage.do" method="post">
            <div class="sub_wrap">
              <div class="right_input">
                  <input class="text-field" type="password" name="pw" id="pw" placeholder="비밀번호를 입력해주세요."><br>
              </div>
           </div>
            <input type="hidden" name="idx" value="<%=usersDto.getIdx() %>"><br>
            <input class="pwch_btn" type="button" value="확인" onclick="checkpw()">
         </form>
      </div>
   </div>
   </div>
   <jsp:include page="footer.jsp"/>
   
   <script>
    function checkpw() {
       var pw = document.frm.pw;
       
       if(pw.value == "") {
             alert("비밀번호를 입력해주세요");
             pw.focus();
             return false;
         }else if(pw.value.indexOf(" ") != -1) {
             alert("빈칸은 포함되면 안됩니다");
             pw.focus();
             return false;
         }else {
            document.frm.submit();
         }
    }
   </script>
</body>
</html>