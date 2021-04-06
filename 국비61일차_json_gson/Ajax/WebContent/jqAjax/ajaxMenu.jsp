<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-2.2.4.min.js" ></script>
<script type="text/javascript">
$(document).ready(function(){
	$("a").click(function(){
		console.log("a태그 클릭")
		console.log($(this))
		
		// jq객체.load( url )
		// -> url롤 AJAX요청을 보낸 뒤 응답데이터를 jq객체의 innerHTML로
		// 반영한다
		$(".right").load($(this).attr("href")) //메뉴 구현
		
		//<a>태그의 기본동작(페이지이동) 막기
		return false;
	})
})
</script>
<style type="text/css">
.left{
	float: left;
	width: 30%;
	background: #ccc;
}

.right{
	float: right;
	width: 65%;

}


</style>

</head>

<body>

<h1>AJAX메뉴</h1>
<hr>

<div class="left">
	<a href="/ajax/ajax_02.jsp">Ajax 02</a><br>
	<br>
	<a href="/ajax/ajax_03.jsp">Ajax 03</a><br>
	<br>
	<a href="/ajax/ajax_04.jsp">Ajax 04</a>
</div>

<div class="right">
</div>

</body>
</html>