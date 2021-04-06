<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 전달파라미터를 변수에 저장 --%>
<% int n1 = Integer.parseInt(request.getParameter("num1")); %>
<% int n2 = Integer.parseInt(request.getParameter("num2")); %>
<% String oper = request.getParameter("oper"); %>

<%-- post로 넘겨받은 oper 에 대한 if문  --%>
<% if("add".equals(oper)) {%>
	<h3> <%=n1 %> + <%=n2 %> = <%=n1+n2 %></h3>

<% }else if("sub".equals(oper)) { %>
	<h3> <%=n1 %> - <%=n2 %> = <%=n1-n2 %></h3>

<% }else if("mul".equals(oper)) { %>
	<h3> <%=n1 %> * <%=n2 %> = <%=n1*n2 %></h3>

<% }else if("div".equals(oper)) { %>
	<h3> <%=n1 %> / <%=n2 %> = <%=n1/(double)n2 %></h3>

<% }%>
