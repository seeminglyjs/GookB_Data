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
		sendRequest("POST", "/ajax/test01", "", callback)
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
	
	//ajax 응답 데이터
	var respText = httpRequest.responseText;
	console.log("---respText -----")
	console.log(respText)
	
	console.log(JSON.parse(respText))
////////////////////////////////////////////////

	//<div> 태그에 내용으로 채워넣기
	
	//JSON text를 언마샬링하여 변수에 저장
	var list = JSON.parse(respText)
	
	//DOM API 를 이용하여 html 구문 작성
	var html = ""
	for(var i =0; i < list.length; i++){
		html += "<h1>" +list[i].id + ":" + list[i].pw +  "</h1>" 
	}

	//완성된 html구문을 <div> 에 반영
	result.innerHTML = html;

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