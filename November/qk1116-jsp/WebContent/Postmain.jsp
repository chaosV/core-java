<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>使用POST方法读取数据</h1>
	<ul>
		<li><p><b>网站名：</b>
	<%
		String name=new String((request.getParameter("name")).getBytes("ISO-8859-1"),"UTF-8");
	%>
	<%=name%>
	</p></li>
		<li><p><b>网址：</b>
		<%=request.getParameter("url") %>
		</p></li>
	</ul>
	
</body>
</html>