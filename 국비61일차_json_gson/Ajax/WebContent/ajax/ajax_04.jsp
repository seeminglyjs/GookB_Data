<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/js/httpRequest.js"></script>
<script type="text/javascript">
function ajaxToServer(){
	var params = "username=" + document.f.username.value 
				+ "&content=" + document.f.content.value
	
	sendRequest("POST","/ajax/ajax_04_ok.jsp",params, function(){
		if(httpRequest.readyState == 4){
			if(httpRequest.status == 200){
				result.innerHTML += httpRequest.responseText
				/* var node = document.createElement("div")
				var text = document.createTextNode(httpRequest.responseText);
				node.appendChild(text) 
				f.appendChild(node)
				 */// 해봤는데 단순 택스트만 넘겨 받아서 안됨
				username.value =""
				content.value =""
			}
		}
	})
}


</script>

</head>
<body>

<h1>AJAX 04</h1>
<hr>

<!-- 이름, <input>태그, id="username" -->
<!-- 내용, <input>태그, id="content" -->

<!-- 이름, 내용 두가지 데이터를 ajax_04_ok.jsp 로 전송 -->
<!-- 전송한 데이터를 이용하여 응답데이터로 작성한다 -->

<!-- 응답 받은 데이터를 이용하여 <div>를 생성하고 그 안에 데이터를 기록 -->
<!-- 형식

	<div>
		name: Alice
		content: 안녕하세요!
		
		Alice님, 안녕하세요!
	</div>

 -->
<!-- 응답받은 <div>데이터는 <button> 하단에 계속해서 추가되도록 만든다 -->

<form name="f" id="f">
	<input type="text" id="username" name="username"/>
	<input type="text" id="content" name="content"/>
	<button type="button"onclick="ajaxToServer();">전송</button>
</form>
<div id="result"></div>
</body>
</html>














