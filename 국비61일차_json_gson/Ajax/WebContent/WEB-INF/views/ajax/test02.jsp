<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/js/httpRequest.js"></script>
<script type="text/javascript">
window.onload = function(){
	
	//#btnAction에 click 이벤트 리스너 등록
	btnAction.onclick = function(){
		//Ajax요청 보내기
		sendRequest("POST", "/ajax/test02", "", callback)
	}	
}
////////////////////////////////
//ajax 응답 처리 콜백함수
function callback(){
	if(httpRequest.readyState ==4){
		if(httpRequest.status == 200){
			console.log("callback 불러오기 성공")
		
			//결과 처리 함수 호출
			printData();
		
		}else{
			console.log("callback 불러오기 실패")
		}
	}
}
////////////////////////////
function printData(){
	console.log("printData")
	
	//응답 데이터를 div태그에 넣기
	result.innerHTML = httpRequest.responseText;

}


</script>


</head>
<body>
<h1>AJAX 테스트</h1>
<hr>

<button id="btnAction">AJAX 요청</button>
<div id="result"></div>

</body>
</html>