<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Heloo its my new webpage</title>
</head>
<%
String s = "Mujassam Taukir khan";
System.out.println("hello world");
java.util.Date date =  new java.util.Date();
%>
<body>
<h1>Current date and time <%=date %></h1>
<input type="text" placeholder="hello">
<p><%=s %></p> 
<p>Inside in JSP ${ name} and password is ${ password}</p>
<p>So for the security we are using the post method in form</p>

<form action="/login.do">
Enter Name <input type="text" placeholder="yourname" name="name"/> <input type="submit"/>
</form>
</body>
</html>