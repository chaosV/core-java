<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My First JSP Demo!</title>
</head>
<body>
<p>
	<%
		out.println(" HELLO JSP!");
		
	%>
</p>
	<table border="1">
		<tr><th>ONE</th><th>TWO</th></tr>
		<tr><td>1</td><td>2</td></tr>

<p> <%=(new java.util.Date()).toLocaleString()%>  </p>

	</table>
</body>
</html>