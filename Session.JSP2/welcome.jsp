<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<%
String name = request.getParameter("uname");

if(name != null && !name.isEmpty()){
    session.setAttribute("user", name);
}

session.setMaxInactiveInterval(60);

long expiryTime = session.getMaxInactiveInterval();

String user = (String) session.getAttribute("user");

out.print("Hello " + user);
out.print("<br>Session has started...");
out.print("<br>Session Expiry Time: " + expiryTime + " seconds");
out.print("<br>Click the link below within the session time<br>");
%>

<a href="second.jsp">Check Session</a>

</body>
</html>