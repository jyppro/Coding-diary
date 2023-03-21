<%@page import="com.dbshop.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<style>
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100&family=Source+Code+Pro:ital,wght@1,900&display=swap');
</style>
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100&display=swap" rel="stylesheet">
<link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"
  />
<style>
   *,html,body{
      margin: 0;
      padding: 0;
   }
   #topwrap{
      width: 90%;
      margin: 0 auto;
   }   
   #topMiddle{
      border:2px solid #F5F5F5;
      display: flex;
      justify-content: space-between;
      height: 130px;
      padding-left: 50px;
      padding-right: 50px;
   }
   .searchMenu{
      /* position: absolute;
      top: 70px;
      left: 170px; */
      width: 250px;
      height:40px;
      
      
   }
   .searchtext{
      /* position: absolute;
      top:10px;
      height:20px; 
      border:none;*/
      border-top:none;
      border-left:none;
      border-right:none;
      border-bottom: 2px solid rgb(184, 181, 196);
   }
   .search{
      /* position: absolute;
      top: 9px;
      right:5px; */
      color: black;
      font-size: 23px;
      
   }
   .topmenu{
      text-align: right;
      padding-right: 100px;
      /* position: absolute;
      right: 450px; */
   }
   .topmenu a{
      font-family: bold 'Noto Sans KR', sans-serif;
      text-decoration: none;
      color:black;
      font-size: 14px;
      margin-left: 12px;
   }
   
   .middlemenu{
   	  /* display: flex; */
   	  width: 250px;
   	  /* justify-content: space-around; */
      /* position: absolute;
      right: 280px; */
      padding-top: 40px;
   }
   .cart{
      color: black;
      font-size: 25px;
      margin-left:25px;
   }
   .main{
      color: black;
      font-size: 25px;
      margin-left:25px;
   }
   .mypage{
      color: black;
      font-size: 25px;
      margin-left:25px;
   }
   .title{
   	  position: absolute;
      font-family: 'Noto Sans KR', sans-serif;
      font-family: 'Source Code Pro', monospace;
      text-decoration: none;
      color:black;
      font-size:30px;
   }
   
    .menubar{  
      border-top:2px solid #F5F5F5 ;
      border-bottom:1.8px solid #F5F5F5 ;
      width:100%;
      height: 60px;
      display: flex;
      justify-content: space-between;
   }
   .menubar1{
      list-style: none;
      display: flex;
   }
   .menubar2{
      list-style: none;
      display: flex;
   }
   
   .menubar1 li{
      font-family: bold 'Noto Sans KR', sans-serif;
      font-weight: bold;
      margin-top:18px;
      margin-left: 40px;
   }
   .menubar2 li{
      font-family: bold 'Noto Sans KR', sans-serif;
      font-size: 15px;
      margin-top:18px;
      margin-right: 60px;
   }
   li a{
      text-decoration: none;
      color:black;
   }
   li a:hover{
      color: pink;
      transition: color 1s ease;
   }
   button{
   		content:"\f002";
   		font-family: "Font Awesome 5 Free";
   		outline: 0;
   		border: 0;
   		width: 30px;
   		height: 30px;
		background-color: white;
		font-size: 20px;
   }
	i{
		/*color: rgba(143, 133, 201, 0.8);*/
		color:rgb(153, 147, 177);
	}
	.DBshop{
		position: absolute;
		top:-30px;
		left: -170px;
	}
	.blinking{ 
		animation:blink 1.5s ease-in-out infinite alternate; 
	} 
	@keyframes blink{ 
		0% {opacity:0;} 100% {opacity:1;} 
	}
</style>

<jsp:include page="ad.jsp"/>
<div id="topwrap">
   <div style="text-align: right; background-color: #F5F5F5;height: 30px;padding-top: 5px;">
<%
   UsersDto usersDto = (UsersDto)session.getAttribute("userInfo");
    if(usersDto == null) { // 로그인이 안됐다면
%>       
      <div class="topmenu">   
	      <a href="/Login.do">로그인 </a>
	      <a href="/Tos.do">회원가입</a>
      </div>
<%
    }else { // 로그인이 됐다면
%>    
		<div class="topmenu">  
			<%=usersDto.getName() %>님 반갑습니다<i class="far fa-smile"></i>
		    <a href="/Logout.do">로그아웃 </a>
		    <a href="/Orderchk.do">주문조회 </a>
		    <a href="/PwChk.do">마이페이지</a>
	<%      
		if(usersDto.getLv()==10){
	%>
			<a href="Delivery.do">배송관리</a>
	 	    <a href="Board.do">게시물관리</a>
	  <%}%>
   		</div>
  <%}%>
  
      
   </div>
   <div id="topMiddle">
		<form action="Main.do" method="post">
		<!-- <select name="kind">
			<option value="1">티셔츠</option>
			<option value="2">바지</option>	
			<option value="3">치마</option>				
		</select> -->
   
      <div class="searchMenu" style="padding-top: 40px;">
         <input type="text" name="search" class="searchtext">
         <a href="Search.do" class="search"></a><!--  input type="submit" value="\f002"-->
         <button><i class="fa fa-search"></i></button> 
      </div>
      </form>
      
      <div style="padding-top: 40px;">
         <a href="Main.do" class="title"><img src="img/DBshop.jpg" class="DBshop blinking"></a>
      </div>
      <div class="middlemenu">
         <a href="Main.do" class="main"><i class="fas fa-home"></i></a>
         <%if(usersDto != null) { %>
         <a href="Cart.do" class="cart"><i class="fas fa-shopping-cart" ></i></a>
         <a href="PwChk.do" class="mypage"><i class="fas fa-user"></i></a>
         <%} %>
      </div>
      
   </div>
   <div class="menubar">
	   <ul class="menubar1">
	      <li><a href="Main.do">전체메뉴</a></li>
	      <li><a href="MainKind.do?kind=1">셔츠</a></li>
	      <li><a href="MainKind.do?kind=2">바지</a></li>
	      <li><a href="MainKind.do?kind=3">스커트</a></li>
	   </ul>
	   <ul class="menubar2">
	      <li><a href="">신상5%</a></li>
	      <li><a href="">1 <i class="fas fa-plus"></i> 1</a></li>
	      <li><a href="">베스트100</a></li>
	      <li><a href="">핸드메이드</a></li>
	      <li><a href="">TIME <i class="fas fa-stopwatch"></i> SALE</a></li>
	      <li><a href="">악세서리</a></li>
	   </ul>
   </div>
   <br><br>

   <br><br>
</div>