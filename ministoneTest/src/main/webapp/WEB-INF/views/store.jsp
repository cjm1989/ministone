<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		 background-color: black;
	}
	#header{
		position: absolute;
		left: 800px;
		top: 90px;
		font-size: 30px;
	}
	#wrapper{
		width: 1100px;
		height: 850px;
		background-color: graytext;
		margin-left: 200px;
		border-radius: 3em;
	}
	img{
		width: 150px;
		height: 225px; 
	}
	#center{
		position: absolute;
		left: 500px;
		top: 300px;
		width: 1000px;
	}
	#firstcard{
		position: absolute;
		top: 90px;
		left: 250px;
		cursor: pointer;	
	}
	#fivecard{
		position: absolute;
		top: 350px;
		left: 250px;
		cursor: pointer;
	}
	#fifteencard{
		position: absolute;
		top: 610px;
		left: 250px;
		cursor: pointer;
	}
	p{
		margin-top: 2px;
		margin-left: 2px;
		font-size: 23px;
	}
	#footer{
		position: absolute;
		top: 550px;
		left: 450px;
		/* background-color: green; */
		font-size: 20px;
	}
	#footerright{
		position: absolute;
		top: 550px;
		left: 890px;
		/* background-color: pink; */
		font-size: 15px;
		width: 300px;
	}
	#button{
		width: 200px;
		height: 10px;
		border: none;
		background-color: gray;
	}
	#price{
		background-color: grey;
		border: 0 none;
		font-size: 20px;
		font-weight: bold;
		width: 52px;
	}
	#number{
		border: none;
		background-color: gray;
		font-size: 20px;
		font-weight: bold;
		width: 22px;
	}
</style> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" >
	$(function(){
		
		$("#firstcard").on('click',function(){
			$("#centercard").show();
			$("#centercard1").hide();
			$("#centercard2").hide();
		});
		$("#fivecard").on('click',function(){
				$("#centercard").show();
				$("#centercard1").show();				
				$("#centercard1").css("margin-left",20);		
				$("#centercard2").hide();
		});
		$("#fifteencard").on('click',function(){
			$("#centercard").show();
			$("#centercard1").show();	
			$("#centercard1").css("margin-left",20);
			$("#centercard2").show();
			$("#centercard2").css("margin-left",20);
		});	
	});
		function prt(){
			$("#price").val("100");
			$("#number").val("1");
		}
		function prt1(){
			$("#price").val("400");
			$("#number").val("5");
		}
		function prt2(){
			$("#price").val("1500");
			$("#number").val("15");
		}
</script>
</head>
<body> 
	<form  action="storOk.do">
	
		<div id="wrapper">
			<div id="header">
				point:&nbsp;${dto.point }<!--  사용자의 point값 -->		
			</div>
					
			<div id="left">
					<div id="firstcard"  > 		 <!-- 팩 1장 $100 -->
					<img onclick="prt()" src="<c:url value="/images/1.jpg"  />" alt="1장 카드" />
					</div>
					
					<div id="fivecard" >		<!-- 팩 5장 $400 -->
					<img onclick="prt1()" src="<c:url value="/images/2.jpg" />" alt="5장 카드"  />
					</div>
					
					<div id="fifteencard"  >	<!-- 팩 15장  $1200 -->
					<img onclick="prt2()" src="<c:url value="/images/3.jpg" />" alt="15장 카드"  />
					</div>		
			</div>
			
			<div id="center"> 		<!-- 카드팩을 클릭했을때 나오는 이미지 -->
				<img src="<c:url value="/images/77.jpg" />" alt="카드 팩 사진" id="centercard" hidden="" />
				<img src="<c:url value="/images/77.jpg" />" alt="카드 팩 사진" id="centercard1" hidden="" />
				<img src="<c:url value="/images/77.jpg" />" alt="카드 팩 사진" id="centercard2" hidden="" />			
			</div>
			
			<div id="footer">
				<br />이용기간 : 서비스 종료 시까지, 본 상품은 구매 후 
				<br />7일 이내에 청약철회가 가능합니다.
				<br />다만, 1개의 카드 팩이라도 개봉한 경우에는
				<br />철약철회가 불가능합니다.				
			</div>
			
			<div id="footerright">
				<div style="display: inline;">		<!-- 카드 팩을 클릭시 가격정보가 나오는 곳 -->
				<input type="text" name="number" id="number" value="0" />
				<span style="font-size: 20px; font-weight: bold;">장</span>
				 <span style="font-size: 20px; margin-left: 50px; font-weight: bold;">$</span>
				 <input type="text" name="value" id="price" value="0" >			
				</div>
				<div id="buy" style="width: 90px;">	<!-- 구매버튼 -->
					<button id="button" type="submit">
					<img style="width: 200px; height: 130px;" src="<c:url value="/images/buy.png" />">
					</button>
				</div>
			</div>
		</div>	
	</form>

</body>
</html>