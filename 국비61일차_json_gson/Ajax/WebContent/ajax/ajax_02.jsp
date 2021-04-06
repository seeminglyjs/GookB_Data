<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//ajax객체인 XHR을 생성하는 함수(크로스 브라우징)
function createXMLHttpRequest(){
	//xhr 객체 변수
	var xmlReq = null;
	
	if(window.XMLHttpRequest){ //XMLHttpRequest 내장객체가 존재할 때
		//IE 7.0 이상
		//IE 브라우저가 아닐 때(크롬, 사파리, 오페라 등등)
		xmlReq = new XMLHttpRequest();	
	}else if(window.ActiveXObject){
		//ActiveXObject 내장객체가 존재할 때
		//IE 계열 브라우저
		try{
			//비교적 최근 버전의 IE
			xmlReq = new ActiveXObject("Msxml2.XMLHTTP");
		}catch(e1){
			try{
				//비교적 예전버전의 IE
				xmlReq = new ActiveXObject("Microsoft.XMLHTTP");
			}catch(e2){
				//XHR내장객체가 아예 없는 경우
				console.log("AJAX객체 생성 실패")
			}
		}
	}	
	//xhr객체 반환
	return xmlReq;
}
</script>

<script type="text/javascript">
//ajax객체 변수
var xmlHttp = null;

function send(){
	console.log("send called")
	
	//xhr 객체 생성
	xmlHttp = createXMLHttpRequest();
	console.log(xmlHttp)
	
	//----입력 데이터 구하기----
	var n1 = num1.value;
	var n2 = num2.value;
	var op = oper.value;
	console.log(n1,n2,op)
	
	
	//----ajax 요청 전 설정 ----
	//요청 url
	
	var query = "num1="+n1+"&num2="+n2+"&oper="+op;// 쿼리스트링 생성
	var url = "/ajax/ajax_02_ok.jsp" + "?" + query; // 전송 url 작성
	console.log(url)
	
	//요청Method
	var method = "GET";
	
	//서버로부터 응답데이터가 전달되면 호출되는 콜백함수
	xmlHttp.onreadystatechange = callback;
	
	//----ajax요청 준비 ----
	xmlHttp.open(method, url)
	
	//----ajax요청 보내기 ----
	xmlHttp.send(null);
	
}

//응답 완료 시 데이터를 처리하는 콜백함수
function callback(){
	console.log("callback called")
	
	//readyState, 4, Done, 응답이 완료된 상태
	if(xmlHttp.readyState == 4){
		console.log("응답받기 완료")
		
		//정상적인 응답 완료
		if(xmlHttp.status == 200){
			console.log(xmlHttp.responseText) // 응답 데이터 출력
			resultLayout.innerHTML = xmlHttp.responseText
		}else{
			console.log("error", xmlHttp.status)
		}
	}
}

</script>


</head>
<body>

<h1>계산기 01</h1>
<h3>기본 http 통신(비동기식)</h3>
<hr>

<input type="text" id="num1"/>
<select id="oper">
	<option value="add">더하기</option>
	<option value="sub">빼기</option>
	<option value="mul">곱하기</option>
	<option value="div">나누기</option>
</select>
<input type="text" id="num2"/>
<button onclick="send();"> = </button>

<hr>
<!-- ajax요청의 결과를 추가할 div  -->
결과값
<div id="resultLayout"></div>

</body>
</html>