<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

//자바스크립트 객체
var json = {"a":1, "b":2, "c" : "Cherry", "d":true, "e": ["1",2], "f" : {"key":"val"}}
console.log(json)

//json객체 -> json텍스트 (마샬링)
var jsonText = JSON.stringify(json);
console.log(jsonText)

//json텍스트를 변수에 저장하기
var jsonText2 = "{\"a\":1,\"b\":2,\"c\":\"Cherry\",\"d\":true,\"e\":[\"1\",2],\"f\":{\"key\":\"val\"}}";
var jsonText2 = '{"a":1,"b":2,"c":"Cherry","d":true,"e":["1",2],"f":{"key":"val"}}'
// js 에서는 위의 둘다 가능하다
console.log(jsonText2)

//json텍스트 -> json 객체
var jsonObject = JSON.parse(jsonText2);
console.log(jsonObject)

</script>

</head>
<body>

</body>
</html>