<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP 表单处理</title>
</head>
<body>
	<h1>使用GET方法读取数据</h1>
	<ul>
		<li><p><b>站点名：</b>
		<%=request.getParameter("name") %>
		</p></li>
		<li><p><b>网址：</b>
		<%=request.getParameter("url") %>
		</p></li>
	</ul>
</body>
</html>