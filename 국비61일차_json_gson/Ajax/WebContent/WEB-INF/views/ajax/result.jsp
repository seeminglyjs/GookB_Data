<%@page import="dto.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% List<Member> list = (List) request.getAttribute("list"); %>

<table border = 1>
<tr>
	<th>아이디</th><th>비밀번호</th>
</tr>
<tr>
<% for(int i = 0; i <list.size(); i++){ %>
	<td><%=list.get(i).getId() %></td>
	<td><%=list.get(i).getPw() %></td>
</tr>
<% } %>

</table>