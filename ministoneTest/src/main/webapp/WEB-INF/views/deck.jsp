<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deck.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style type="text/css">
*{
	margin: 0px;
	padding: 0px;
}

html, body {
	height: 100%;
	margin: 0;
	background-color: gray;
	
}

#container {
	position: fixed;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
	overflow: auto;
	background: lime;
}

#head {
	background-color: red;
	height: 10%;
	width: 75%;
	float: left;
	
}

#list {
	background-color: yellow; 
	height: 80%;
	width: 75%;
	float: left;
	/* z-index: 1; */
	
}

#listright {
	width: 10%;
	float: right;
	background-color: blue;
	height: 100%;
	/* z-index: 2; */
}

#listleft {
	width: 10%;
	float: left;
	background-color: gray;
	height: 100%;
	/* z-index: 2; */
	
}

.cardlist {

	width: 80%;
	background-color: pink;
	height: 100%;
	float: left;
	z-index: 0;
}

#mydeck {
	background-color: white;
	/* position: relative; */
	height: 100%;
	width: 25%;
	float: right;

}

#foot {
	background-color: green;
	height: 10%;
	width: 75%;
	width: 100%;
	float: left;
	text-align: center;
	
}

.card{
	width: 200px;
	height: 300px;
	
	
	margin-bottom: 40px;
	margin-left: 40px;
	margin-right: 40px;
	margin-top: 40px;
	background-color: white;

	float: left;
	z-index: 0;


}

 img{
	
	padding-top: 40px;
	padding-left: 50px;
	padding-right: 50px;
	padding-bottom: 40px;
	
} 

#mydeckimg {
	
	margin-left: 20px;
	width: 320px;
	height: 80px;
	padding-bottom: 10px;
	
}

.deckchoice{
	margin-left: 20px;
	padding-bottom: 5px;
	padding-top: 5px;
	width: 320px;
	height: 100px;
	

}


#deckchoice1 {
	border: 1px solid black;
	margin-left: 70px;
	margin-bottom: 10px;
	padding-left: 40px;
	padding-bottom: 15px;
	padding-top: 5px;
	width: 280px;
	height: 70px;
}

.showdiv2 {
	color: yellow;
	
}

.show {
	display: none;
	background-color: black;
	height: 70%;
	margin-left: 10%;
	margin-right: 15%;
	width: 75%;
	float: right;
	border: 2px solid red;
	
}

.showdiv{
	display: none;
	
	width: 100%;
	height: 3%;
	border: 2px solid pink;
	
}

#deckfoot {
	height: 20%;
}

#okay {
	display: none;
	height: 60px;
	width: 100px;
	margin-left: 60%;
		
}

#back {
	height: 60px;
	width: 100px;
	margin-left: 60%;
}

.img {
	width: 180px;
	height: 200px;
	padding: 0px;
	margin-left: 10px;
	
}

.card2 {
	display: none;
	/* position: absolute; */
	float: left;
	/* transition: all 0.8s ease-in-out;  */
	/* opacity: 0; */
	/* z-index: 1; */
	
}


.deckchoice111 {
	width: 250px;
	height: 60px;
	margin: 0px;
	padding: 0px;
}

.scroll {
	height: 700px;
}

li {
	display: inline;
	float: left;
}


.text-center marg-top {
	text-align: center;
	width: 50%;
	height: 50%;
}


#listright2, #listleft2{
	width: 100%;
	height: 100%;
}
</style>

<script type="text/javascript">


$(document).ready(function(){
	
	/* console.log($("#name1")); */
	
	
	
		$(".card").on('click', function(){
		
	console.log($(this).find('span[class=name]').text());
		
		var name = $(this).find('span[class=name]').text();
	
		$(".showdiv2").append('<tr><td><p>'+name+'</p></td></tr>'); 

	}); 
	
/* 	
	$(".card").on('click', function(){
		//alert($("#name1").text());
	
	console.log($(this).find('span[class=name]').text());
		
		var name = $(this).find('span[class=name]').text();
	
		$(".showdiv2").append('<tr><td><p>'+name+'</p></td></tr>'); 
		/* $(".showdiv2").append(name); 
		
	});*/
	
/* 	$(".card").each(function(index){
		alert(index+ ' , '+this.text()); */

	
    $(".deckchoice111").click(function(){
        $("#mydeckimg").hide("1000");
        $(".deckchoice").hide("1000");
        $("#back").hide("1000");
        $("#okay").show("1000");
        $("#deckchoice1").animate({up : '40px', height : '150'},"slow");
        $(".deckchoice111").animate({height : '100'})
        $(".show").slideToggle("slow");
        $(".showdiv").slideToggle("slow");
        $(".scroll").animate({height : '150'});
    
    });
    
    
    $("#okay").click(function(){
    	$(this).hide("1000");
    	$("#back").show("1000");
    	$("#mydeckimg").show("1000");
    	$(".show").hide("1000");
    	$(".showdiv").hide("1000");
    	$(".deckchoice").show("1000");
    	$("#deckchoice1").animate({down : '40px', height : '70'},"slow");
    	$(".deckchoice111").animate({height : '60'});
    	 $(".scroll").animate({height : '700'});
    });
    
    
    $("#listleft").mouseenter(function(){
    	
    	$(this).css('cursor','pointer');
    
    });
    
	$("#listright").mouseenter(function(){
    	
    	$(this).css('cursor','pointer');
    	
    });
	
 	$(".showdiv2").hover(function(){
		$(this).css('cursor', 'pointer');
		$(".card2").show("1000");
	
	});  
 	
 	$(".showdiv2").mouseleave(function(){
 		$(".card2").hide("1000");
 	});
	
 	$("#btn11").on('click',function(){
 		
	console.log($("#deckchoice11").val());
	
		
		var name1 =$("#deckchoice11").val();
		
		$("#deckchoice11").append(name1);
 		
 		
 	});
 	
 	$("#delete").on('click', function(){
 		$(".showdiv2").remove();
 		
 	});
 	
 


});
 	


function goPage(pages, lines) {
    location.href = '?' + "pages=" + pages;
}

</script>




</head>
<body>
<div id="container">

<div id="head">
<h1 style="margin-bottom: 0;">Head</h1>
</div>
<div id="mydeck">
	<div id="deck">
		<img src="images/mydeck.png" alt="마이덱" id="mydeckimg" />
	</div>
	<div id="choice">
	<div class="scroll" style="overflow-y: scroll;">
	<div id=deckchoice1>
	<form action="#">
	<input type="text" name="deckchoice11" id="deckchoice11" placeholder="덱 이름 입력"/>
	<input type="reset" value="초기화" />
	<input type="button" value="입력" id="btn11" />
	<img src="images/choice.png" alt="초이스" class="deckchoice111" />
	
	</div>
	</form>
		<!-- <img src="images/choice.png" alt="초이스" id="deckchoice1" /> -->
		<img src="images/choice.png" alt="초이스" class="deckchoice" />
		<img src="images/choice.png" alt="초이스" class="deckchoice" />
		<img src="images/choice.png" alt="초이스" class="deckchoice" />
		<img src="images/choice.png" alt="초이스" class="deckchoice" />
		<img src="images/choice.png" alt="초이스" class="deckchoice" />
		<img src="images/choice.png" alt="초이스" class="deckchoice" />
		<img src="images/choice.png" alt="초이스" class="deckchoice" />
		<img src="images/choice.png" alt="초이스" class="deckchoice" />
		
		
		</div>
	</div>	
	
	
	
	<div class="show">
	
	
	
	<div class="showdiv" id="showdiv1">
		<!-- <p class=showdiv2></p> -->
	<%-- 	<span class="name"><c:out value="${i.name }">${i.name }</c:out></span> --%>
		<table id="pp">
	<thead>
	<tr>
	
    <h4 style="color: red">카드를 선택하세요</h4> <input type="reset" value="삭제" id="delete"> 
    </tr>
    </thead>
    <tbody id="my-tbody">
   <tr> 
		<input type="hidden" name="cid" value="${i.cid }"/>
		<img src="images/card2.jpg" alt="" class="card2" />
        <p class="showdiv2" style="color: white" size="100"> </p>
  
    
    </tr>
    
    </tbody>
    
    
   
		</table>

			
			
			
				
	</div> 

	
	<div class="showdiv3"></div>



</div>
	
	<div id="deckfoot">
		<input type="button" value="완료" id="okay" />
		<input type="button" value="뒤로" id="back"/>
	</div>

</div>

<div id="list">

	<div id="listleft">
	<c:if test="${paging.currentPageNo gt 1}"> 
	<a href="javascript:goPage(${paging.currentPageNo-1})" style="font-size: 20px">
	<div id="listleft2">이전</div></a></c:if>
	</div>
	
	<div id="listright">
	<c:if test="${paging.currentPageNo < paging.nextPageNo }">
	<a href="javascript:goPage(${paging.currentPageNo+1})" style="font-size: 20px">
	<div id="listright2">다음</div>	
	</a>
	</c:if>
 	</div>

	<div class="cardlist">
	<form action="#" name="frm">
	<c:forEach var="i" items="${list }" >
		<div class="card" id="card1"> 		
		<span class="mana">${i.mana }</span>
		<img src="images/card1.jpg" class="img" alt="카드이미지" />
<%-- 		<span class="name" id="name1">${i.name }</span>
		<input type="hidden" name="card_name" value="${i.name }" /> --%>
		
		<span class="name"><c:out value="${i.name }">${i.name }</c:out></span>
		<span class="atk">${i.atk }</span>
		<span class="cardtext">${i.cardtext }</span>
		<span class="hp">${i.hp }</span>
		<input type="hidden" name="cid" value="${i.cid }"/>
	
	</div> 
	
 	
 	</c:forEach>
 	
 	</form>
</div>


<div id="foot">
	<!-- 페이징  -->
		<c:choose>
		<c:when test="${paging.numberOfRecords ne NULL and paging.numberOfRecords ne '' and paging.numberOfRecords ne 0}">
		<div class="text-center marg-top">
			<ul class="pagination">
			 	<c:if test="${paging.currentPageNo gt 5}">   											  <!-- 현재 페이지가 5보다 크다면(즉, 6페이지 이상이라면) -->
					<li><a href="javascript:goPage(${paging.prevPageNo}, ${paging.maxPost})">&nbsp;이전&nbsp;</a></li> <!-- 이전페이지 표시 -->
				 </c:if> 
				<!-- 다른 페이지를 클릭하였을 시, 그 페이지의 내용 및 하단의 페이징 버튼을 생성하는 조건문-->
					<c:forEach var="i" begin="${paging.startPageNo}" end="${paging.endPageNo}" step="1"> <!-- 변수선언 (var="i"), 조건식, 증감식 -->
		            <c:choose>
		                <c:when test="${i eq paging.currentPageNo}"> 
		                      <li class="active"><a href="javascript:goPage(${i}, ${paging.maxPost})">&nbsp;${i}&nbsp;</a></li> <!-- 1페이지부터 10개씩 뽑아내고, 1,2,3페이지순으로 나타내라-->
		                </c:when>
		                	<c:otherwise>
		                    <li><a href="javascript:goPage(${i}, ${paging.maxPost})">&nbsp;${i}&nbsp;</a></li> 
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<!-- begin에 의해서 변수 i는 1이기 때문에, 처음에는 c:when이 수행된다. 그 후 페이징의 숫자 2를 클릭하면 ${i}는 2로변하고, 현재는 ${i}는 1이므로 otherwise를 수행한다
					         그래서 otherwise에 있는 함수를 수행하여 2페이지의 게시물이 나타나고, 반복문 실행으로 다시 forEach를 수행한다. 이제는 i도 2이고, currentPageNo도 2이기 때문에
					     active에 의해서 페이징부분의 2에 대해서만 파란색으로 나타난다. 그리고 나머지 1,3,4,5,이전,다음을 표시하기위해 다시 c:otherwise를 수행하여 페이징도 나타나게한다.-->
				<!-- // 다른 페이지를 클릭하였을 시, 그 페이지의 내용 및 하단의 페이징 버튼을 생성하는 조건문-->
										
				<!-- 소수점 제거 =>-->
				<fmt:parseNumber var="currentPage" integerOnly="true" value="${(paging.currentPageNo-1)/5}"/>
				<fmt:parseNumber var="finalPage" integerOnly="true" value="${(paging.finalPageNo-1)/5}"/>
					
				<c:if test="${currentPage < finalPage}"> <!-- 현재 페이지가 마지막 페이지보다 작으면 '다음'을 표시한다. -->
					<li><a href="javascript:goPage(${paging.nextPageNo}, ${paging.maxPost})">&nbsp;다음&nbsp;</a></li>
				</c:if> 
			</ul>
		</div>
		</c:when>
		</c:choose>
	</div>

</div>

</div>
</body>
</html>