<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"
    import="MODEL.Exercies"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exercises</title>
</head>
<body>
<%
ArrayList IS = (ArrayList)request.getAttribute("IS");
out.println("<tableborder><tr><th>Fname</th><th>Lname</th></tr>");
for (Object ex : IS){
	Exercies e = (Exercies) ex;
	String firstname = e.getFirstname();
	String lastname = e.getLastname();
	
	out.println("<tr><td>" + firstname + "</td><td>" + lastname +
			"</td></tr>");
}
out.println("</table>");
%>
</body>
</html>