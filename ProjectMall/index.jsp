<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>DB Shop</title>
<style>

   .section input[id*="slide"] {
      display:none;
      }
   .section .slidewrap {
      max-width:1200px;
      margin:0 auto;
      }
   .section .slidelist {
      white-space:nowrap;
      font-size:0;
      overflow:hidden;
      position:relative;
      }
   .section .slidelist > li {
      display:inline-block;
      vertical-align:middle;
      width:100%;
      transition:all .5s;
      }
   .section .slidelist > li > a {
      display:block;
      position:relative;
      }
   .section .slidelist > li > a img {
      width:100%;
      }
   .section .slidelist label {
      position:absolute;
      z-index:10;top:50%;
      transform:translateY(-50%);
      padding:50px;
      cursor:pointer;
      }
   

   .section input[id="slide01"]:checked ~ .slidewrap .slidelist > li {
      transform:translateX(0%);
      }
   .section input[id="slide02"]:checked ~ .slidewrap .slidelist > li {
      transform:translateX(-100%);
      }
   .section input[id="slide03"]:checked ~ .slidewrap .slidelist > li {
      transform:translateX(-200%);
      }


   .section input[id="slide01"]:checked ~ .slidewrap li:nth-child(1) .textbox h3 {
      opacity:1;transform:translateY(0);transition-delay:.2s;
      }
   .section input[id="slide01"]:checked ~ .slidewrap li:nth-child(1) .textbox p {
      opacity:1;transform:translateY(0);transition-delay:.4s;
      }
   .section input[id="slide02"]:checked ~ .slidewrap li:nth-child(2) .textbox h3 {
      opacity:1;transform:translateY(0);transition-delay:.2s;
      }
   .section input[id="slide02"]:checked ~ .slidewrap li:nth-child(2) .textbox p {
      opacity:1;transform:translateY(0);transition-delay:.4s;
      }
   .section input[id="slide03"]:checked ~ .slidewrap li:nth-child(3) .textbox h3 {
      opacity:1;transform:translateY(0);transition-delay:.2s;
      }
   .section input[id="slide03"]:checked ~ .slidewrap li:nth-child(3) .textbox p {
      opacity:1;transform:translateY(0);transition-delay:.4s;
      }


   .slide-control > div {
      display:none;
      }
   .section .left {
      left:30px;
      background:url('left.png') center center / 100% no-repeat;
      }
   .section .right {
      right:30px;
      background:url('right.png') center center / 100% no-repeat;
      }
   .section input[id="slide01"]:checked ~ .slidewrap .slide-control > div:nth-child(1) {
      display:block;
      }
   .section input[id="slide02"]:checked ~ .slidewrap .slide-control > div:nth-child(2) {
      display:block;
      }
   .section input[id="slide03"]:checked ~ .slidewrap .slide-control > div:nth-child(3) {
      display:block;
      }


   .slide-pagelist {
      text-align:center;padding:20px;
   }
   .slide-pagelist > li {
      display:inline-block;vertical-align:middle;
   }
   .slide-pagelist > li > label {
      display:block;padding:8px 30px;border-radius:30px;background:#ccc;margin:20px 10px;cursor:pointer;
      }
   .section input[id="slide01"]:checked ~ .slidewrap .slide-pagelist > li:nth-child(1) > label {
      background:#999;
      }
   .section input[id="slide02"]:checked ~ .slidewrap .slide-pagelist > li:nth-child(2) > label {
      background:#999;
      }
   .section input[id="slide03"]:checked ~ .slidewrap .slide-pagelist > li:nth-child(3) > label {
      background:#999;
      }
     
     .container{
     	width: 1200px;
     	margin:0 auto;
     }
      
   	.product{
   		width:100%;
   		/*display:inline-block;*/
   		list-style:none;
   		margin:0 auto;
   		/*margin-left:150px;*/
   		padding: 0;
   		font-size: 0;
   		text-align: center;
   		display:flex;
   		flex-flow: row wrap;
   		justify-content: space-between;
   		}
    .proli{
    	display:inline-block;
    	width: 270px;
    	margin-top: 20px;
    }
   	.product-w{
   		text-align: center;
   		display: block;
   	}
    .product-w img{
    	margin-top:20px;
    	width: 100%;
    	cursor: pointer;
    	}
    .product-w div{
    	font-size: 15px;
    }
   	 .centertitle {
		text-align: center;
		width: 100%;
		height: auto;
		padding-top: 40px;
		margin-bottom: 30px;
		}

	.centertitle-word {
		font-weight: 700;
		font-size: 24px;
		}
	.bottom{
		font-size: 13px;
	}

</style>


</head>
<body style="overflow-x: hidden">
<jsp:include page="top.jsp"/>
<div class="section">
   <input type="radio" name="slide" id="slide01" checked>
   <input type="radio" name="slide" id="slide02">
   <input type="radio" name="slide" id="slide03">
   <div class="slidewrap">
      
      <ul class="slidelist">

         <li class="slidelist">
            <a>
               <label for="slide03" class="left"></label>
               <img src="img/banner1.jpg">
               <label for="slide02" class="right"></label>
            </a>
         </li>
         <li>
            <a>
               <label for="slide01" class="left"></label>
               <img src="img/banner2.jpg">
               <label for="slide03" class="right"></label>
            </a>
         </li>
         <li>
            <a>
               <label for="slide02" class="left"></label>
               <img src="img/banner3.jpg">
               <label for="slide01" class="right"></label>
            </a>
         </li>


         <div class="slide-control">
            <div>
               <label for="slide03" class="left"></label>
               <label for="slide02" class="right"></label>
            </div>
            <div>
               <label for="slide01" class="left"></label>
               <label for="slide03" class="right"></label>
            </div>
            <div>
               <label for="slide02" class="left"></label>
               <label for="slide01" class="right"></label>
            </div>
         </div>

      </ul>

      <ul class="slide-pagelist">
         <li><label for="slide01"></label></li>
         <li><label for="slide02"></label></li>
         <li><label for="slide03"></label></li>
      </ul>
   </div>
<div class="centertitle">
			<h1 class="centertitle-word">
					당신을 위한 추천
			</h1><br>
		</div>
   
</div>
	<div class="container">
		<ul class="product">
			<c:forEach var="dto" items="${ requestScope.data }">
				<li class="proli">
					<div class="product-w">
						<img src="img/${dto.image}" onclick="location.href='ProductRead.do?productNum=${ dto.productNum }'">
						<div class="top">${ dto.name }</div>
						<div class="bottom">${ dto.price } 원</div>
					</div>
				</li>
			</c:forEach>
		</ul>
	</div>
	
   <jsp:include page="footer.jsp"/>
   
</body>
</html>