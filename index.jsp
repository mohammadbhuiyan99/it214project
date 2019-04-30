<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "package.class" %>
<!DOCTYPE html>
<html>
<head>
<%
poem p = new poem();
%>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<table><tr><td><ahref="/Com/index.jsp"> -- Home Page --</a></td></tr>
</table>
<table><tr><td>This is a poem generator</td></tr></table>
<table><tr><td> Here is your 14 line poem: <%=printVerse %></td>
</table>
</body>
</html>
