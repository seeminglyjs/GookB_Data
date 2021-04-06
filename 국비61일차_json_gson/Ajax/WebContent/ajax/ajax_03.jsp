<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="/resources/js/httpRequest.js"></script>
<script type="text/javascript">
//서버로 ajax요청을 보내는 함수
function ajaxToServer(){
	//전달 파라미터 준비
	var params ="username=" + document.f.username.value;
	
	//ajax요청
	sendRequest("POST","/ajax/ajax_03_ok.jsp",params,ajaxFromServer)
}
//서버로부터 ajax응답을 받아서 처리하는 함수
function ajaxFromServer(){
	if(httpRequest.readyState == 4){//DONE, 응답완료
		if(httpRequest.status == 200){//OK. 정상 응답
			console.log("정상응답")			
			console.log(httpRequest.responseText)
			//응답데이터를 div에 반영하기
			result.innerHTML = httpRequest.responseText // html 로 추가
			//result.innerText = httpRequest.responseText	// text로 추가		
		}else{
			console.log("ajax 요청/응답 에러")
		}
		
	}
	
}

</script>

</head>
<body>
<h1>AJAX 03</h1>
<hr>

<form name="f">
	<input type="text" style="display: none;"/>
	<!--form 태그에 input="text" 태그가 단독으로 있을 때
		엔터를 입력하면 submit되어버린다. -->
	<input type="text" name ="username"/>
	<button type="button" onclick="ajaxToServer();">입력</button>
	
</form>
<div id="result"></div>

</body>
</html>