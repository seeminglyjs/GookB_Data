<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세션 정보</h1>
	<hr>

	Session ID :
	<%=session.getId() %>
	<br> Create Time :
	<%=session.getCreationTime() %><br> LastAccessedTime :
	<%=session.getLastAccessedTime() %><br> MaxInterativeInterval :
	<%=session.getMaxInactiveInterval() %><br> is New :
	<%=session.isNew() %><br>
	<hr>
	test 세션정보 :
	<%=session.getAttribute("test") %><br>
	<br>
	<hr>
	
	<a href="/session/create">
		<button>세션 생성</button>
	</a>
	<a href="/session/delete">
		<button>세션 삭제</button>
	</a>
</body>
</html>


