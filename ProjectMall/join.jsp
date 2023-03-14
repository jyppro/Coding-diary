<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
		*{
			margin: 0;
			padding:0;
		}
		
		/* 화면 전체 랩 */
		.wrapper{
			width: 100%;	
		}
		
		/* content 랩 */
		.wrap{
			width : 800px;
			margin: auto;
		}
		/* 페이지 제목 */
		.subjecet{
			width: 100%;
		    height: 120px;
		    background-color: lightgray;
		    text-align: center;
		    line-height: 100px;
		}
		.subjecet span{
		    font-size: 50px;
		    font-weight: 900;
		    color: white;
		}
		
		/* 아이디 영역 */
		.id_wrap{
			width: 100%;
		    margin-top: 20px;
		    float:flex;
		}
		.id_name{
			font-size: 25px;
		    font-weight: bold;
		}
		.id_input_box{
			border: 1px solid black;
		    height: 31px;
		    padding: 10px 14px;
		    width: 61%;
		    float: left;	
			
		}
		.id_input{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;	
		}
		.id_btn{
			border: 1px solid black;
		    height: 51px;
		    width: 30%;
		    float: right;
		    line-height: 50px;
		    text-align: center;
		    font-size: 30px;
		    font-weight: 900;
		    background-color: lightgray;
		    cursor: pointer;	
		}
		
		#res{
			//background-color:green;
			width:200px;
			height:50px;
			
		}
		
		/* 비밀번호 영역 */
		.pw_wrap{
			width: 100%;
		    margin-top: 60px;
		}
		.pw_name{
			font-size: 25px;
		    font-weight: bold;
		}
		.pw_input_box{
			border: 1px solid black;
			height:31px;
			padding: 10px 14px;	
			
		}
		.pw_input{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;
		}
		
		/* 비밀번호 확인 영역 */
		.pwck_wrap{
			width: 100%;
		    margin-top: 20px;
		}
		.pwck_name{
			font-size: 25px;
		    font-weight: bold;
		}
		.pwck_input_box{
			border: 1px solid black;
			height:31px;
			padding: 10px 14px;	
			
		}
		.pwck_input{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;
		}
		
		/* 이름 영역 */
		.user_wrap{
			width: 100%;
		    margin-top: 20px;
		}
		.user_name{
			font-size: 25px;
		    font-weight: bold;
		}
		.user_input_box{
			border: 1px solid black;
			height:31px;
			padding: 10px 14px;	
			
		}
		.user_input{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;
		}
		
		/* 메일 영역 */
		.mail_wrap{
			width: 100%;
		    margin-top: 20px;
		}
		.mail_name{
			font-size: 25px;
		    font-weight: bold;
		}
		.mail_input_box{
			border: 1px solid black;
			height:31px;
			padding: 10px 14px;	
			
		}
		.mail_input{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;
		}
		.mail_check_wrap{
			margin-top: 20px;	
		}
		.mail_check_input_box{
			border: 1px solid black;
		    height: 31px;
		    padding: 10px 14px;
		    width: 61%;
		    float: left;
		}
		.mail_check_input{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;
		}
		
		/* 주소 영역 */
		.address_wrap{
			width: 100%;
		    margin-top: 20px;
		}
		.address_name{
			font-size: 25px;
		    font-weight: bold;
		}
		.address_input_1_box{
			border: 1px solid black;
		    height: 31px;
		    padding: 10px 14px;
		    width: 61%;
		    float: left;	
		}
		.address_input_1{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;	
		}
		.address_button{
		    border: 1px solid black;
		    height: 51px;
		    width: 30%;
		    float: right;
		    line-height: 50px;
		    text-align: center;
		    font-size: 30px;
		    font-weight: 900;
		    background-color: lightgray;
		    cursor: pointer;	
		}
		.address_input_2_wrap{
			margin-top: 20px;
		}
		.address_input_2_box{
			border: 1px solid black;
			height:31px;
			padding: 10px 14px;	
			
		}
		.address_input_2{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;
		}
		
		.address_input_3_wrap{
			margin-top: 20px;
		}
		.address_input_3_box{
			border: 1px solid black;
			height:31px;
			padding: 10px 14px;	
			
		}
		.address_input_3{
			width:100%;
			height:100%;
			border:none;
			font-size:28px;
		}
		
		/* 가입하기 버튼 */
		.join_button_wrap{
			margin-top: 40px;
			text-align: center;
		}
		.join_button{
			width: 100%;
		    height: 80px;
		    background-color: lightgray;
		    font-size: 40px;
		    font-weight: 900;
		    color: white;
		    cursor: pointer;
		}
		
		/* float 속성 해제 */
		.clearfix{
			clear: both;
		}
</style>
<body>
<jsp:include page="top.jsp"/>
<div class="wrapper">
	<form action="Join.do" method="post" name="frm">
	<div class="wrap">
			<div class="subjecet">
				<span>회원가입</span>
			</div>
			<div class="id_wrap">
				<div class="id_name">아이디</div><div id="res" name="res">중복 확인을 해주세요.</div>
				<div class="id_input_box"><input class="id_input" name="id" id="id"></div>
				<input type="button" value="중복확인" class="id_btn" onclick="idcheck()">
			</div>
			<div class="pw_wrap">
				<div class="pw_name">비밀번호</div>
				<div class="pw_input_box">
					<input class="pw_input" name="pw">
				</div>
			</div>
			<div class="pwck_wrap">
				<div class="pwck_name">비밀번호 확인</div>
				<div class="pwck_input_box">
					<input class="pwck_input" name="pw2">
				</div>
			</div>
			<div class="user_wrap">
				<div class="user_name">이름</div>
				<div class="user_input_box">
					<input class="user_input" name="name">
				</div>
			</div>
			<div class="mail_wrap">
				<div class="mail_name">이메일</div> 
				<div class="mail_input_box">
					<input class="mail_input" name="email">
				</div>

			</div>
			<div class="address_wrap">
				<div class="address_name">주소</div>
				<div class="address_input_1_wrap">
					<div class="address_input_1_box">
						<input type="text" class="address_input_1" id="postcode" name="zipcode">
					</div>
					<div class="address_button" onclick="execDaumPostcode()">
						<span>주소 찾기</span>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class ="address_input_2_wrap">
					<div class="address_input_2_box">
						<input  type="text" class="address_input_2" id="roadAddress" name="address">
						<span id="guide" style="color:#999;display:none"></span>
					</div>
				</div>
				<div class ="address_input_3_wrap">
					<div class="address_input_3_box">
						<input type="text" class="address_input_3" name="address2">
					</div>
				</div>
			</div>
			<div class="mail_wrap">
				<div class="mail_name">전화번호</div> 
				<div class="mail_input_box">
					<input class="mail_input" name="phone">
				</div>

			</div>
			<div class="join_button_wrap">
				<input type="button" class="join_button" value="가입하기" onclick="pwCheck()">
			</div>
		</div>
	</form>
</div>

<jsp:include page="footer.jsp"/>


<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	var pw1 = document.frm.pw;
	var pw2 = document.frm.pw2;
	var c = document.getElementById('res');
	function pwCheck() {
		if(pw1.value != pw2.value || pw1.value == '' || pw2.value == ''){
			alert("비밀번호를 확인해주세요.");
			pw1.value="";
			pw2.value="";
		}else if(c.innerHTML == "사용 불가능한 아이디입니다." || c.innerHTML == '중복 확인을 해주세요.'){
			alert("아이디를 확인해주세요.");	
		}else{
			document.frm.submit();
		}
		
	}
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postcode').value = data.zonecode;
                document.getElementById("roadAddress").value = roadAddr;

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
    
    function idcheck() {
    	var params="id="+$("#id").val();
		
		$.ajax({
			type:"post",
			url:"CheckIdAjax.do", 
			data:params,
			dataType:"json",		
			success:function(args){// 문제없이 이전 페이지의 결과를 가져왔다면 실행,결과는 agrs에 담김
				$("#res").text(args.rtn);						
			},					
			error:function(args){// 문제 발생했을 때 실행,에러 내용이 args에 담김
				$("#res").text(args.responseText+"에러!!");
			}				
		});
	}
</script>

</body>
</html>