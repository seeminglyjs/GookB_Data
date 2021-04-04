<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키 확인</h1>
<hr>

<table border="1">
	<tr>
	<th>== Name == </th>
	<th>== Value == </th>
	</tr>
	<%for(Cookie c : request.getCookies()) {%>

	<tr>
		<td><%=c.getName() %></td>
		<td><%=c.getValue() %></td>
	</tr>

	<% } %>
</table>
<br>

<h3><a href="/cookie/create">쿠키 생성</a></h3>
<h3><a href="/cookie/update">쿠키 수정</a></h3>
<h3><a href="/cookie/delete">쿠키 삭제</a></h3>

</body>
</html>