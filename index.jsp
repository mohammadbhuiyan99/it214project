<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "web.Web" %>
<!DOCTYPE html>
<html>
<head>
<%
Web w = new Web();
int addResult = w.add(200, 300);
int multResult = w.multiply(200, 300);
int multResult2 = w.multiply(1000, 300);
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table><tr><td><ahref="/Com/index.jsp"> -- Home Page --</a></td></tr>
<tr><td><ahref="/Com/index.jsp"> -- My Account --</a></td></tr>
<tr><td><ahref="/Com/index.jsp"> -- Shopping Cart --</a></td></tr>
<tr><td><ahref="/Com/index.jsp"> -- Sign off --</a></td></tr>
<tr><td><ahref="/Com/index.jsp"> -- Calculator --</a></td></tr>
</table>
<table><tr><td>This is my Shopping Cart Calculator</td></tr></table>
<table><tr><td> The addition result is: <%=addResult %></td>
<tr><td>The multiply result is: <%=multResult%></td></tr>
<tr><td>The multiply result is: <%=multResult2%></td></tr>
</table>
</body>
</html>
