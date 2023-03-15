<%@ page import="com.dbshop.CookieUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>

   .center_box {
      margin:0 auto;
      width: 500px;
   }
   .center_box>*{
   	text-align: center;
   }
   .center_box>h1 {
      text-align:center;
      margin-top: 50px;
   }
   .login-form {
      width: 100%;
      padding: 20px;
      
   }
   .text-field {
      width: 350px;
      font-size: 20px;
      padding: 10px;
   }
   .submit-btn {
      width: 374px;
      font-size: 20px;
      padding: 10px;
      background-color:#282828;  
      color: white;      
   }
   .info-btn {
      width: 374px;
      font-size: 20px;
      padding: 10px;
      background-color:FFE650;  
      color: black;  
   }
   	.chbox{
   	padding-left: 70px;
   		text-align: left;
   }
</style>
</head>

<!-- ----------------------------------------------------------------------------- -->

<body>
<jsp:include page="top.jsp"/>
   <div>
      <% //아이디 저장에 체크했을 경우, 아이디를 id 입력칸에 미리 적어놓는 역할
         String val = CookieUtil.getCookieValue("saveid",request); //LoginProcHandler에의해 생성된 쿠키임
          if(val == null) { val = ""; } //if를 붙여주면 없어도 괜춘
      %>
      
      <div class="center_box">
         <h1>로그인</h1>
         <div class="login-form">
            <form name="frm" action="LoginProc.do" method="post">
               <input type="text" name="id" class="text-field" value="<%= val %>" placeholder="아이디를 입력해주세요."><br><br>
               <input type="password" name="pw" class="text-field" placeholder="비밀번호를 입력해주세요."><br>
               <br>
               <div class="chbox">
               		<input type="checkbox" name="save" value="true" id="chk" <%= val != "" ? "checked" : "" %>>
               		<label for="chk">아이디 저장</label><br><br>
               </div>
               <input type="button" value="로그인" class="submit-btn" onclick="checklogin()">
               <br><br>
               <input type="button" onclick="location.href='Tos.do'" class="info-btn" value="계정이 없으신가요? 회원가입">
            </form>
         </div>
      </div>
   </div>
   <jsp:include page="footer.jsp"/>
   
   <script>
    function checklogin() {
        if(document.frm.id.value=="") {
          alert("아이디를 입력해주세요.");
          document.frm.id.focus(); //포커스 주기
          return false;
        }else if(document.frm.pw.value=="") {
          alert("비밀번호를 입력해주세요.");
          document.frm.pw.focus(); 
          return false;
        }
        document.frm.submit();
      }
   </script>
</body>
</html>