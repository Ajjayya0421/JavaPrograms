<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Check</title>
</head>
<body>

<h2>Session Status</h2>

<%
String name = (String)session.getAttribute("user");

if(name == null){
    out.print("Session expired!");
}else{
    out.print("Hello " + name);
    out.print("<br>Session is still active");
}
%>

</body>
</html>