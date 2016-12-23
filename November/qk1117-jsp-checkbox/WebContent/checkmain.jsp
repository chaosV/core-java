<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>从复选框读取内容</h1>
<ul>
		<li><p><b>是否已选google:</b>
	<%=request.getParameter("google") %>
	</p></li>
		<li><p><b>是否已选baidu:</b>
	<%=request.getParameter("baidu") %>
	</p></li>
		<li><p><b>是否已选网易:</b>
	<%=request.getParameter("wangyi") %>
	</p></li>
</ul>

<h1>Enum读取所有表单参数</h1>
<table width="50%" border="1" >
	<tr bgcolor="#949494">
	<th>参数名</th><th>参数值</th>
	</tr>
	
	<%
		Enumeration paramNames=request.getParameterNames();
	
		while(paramNames.hasMoreElements()){
			String paramName=(String)paramNames.nextElement();
			out.print("<tr><td>"+paramName+"</td>\n");
			String paramValue=request.getParameter(paramName);
			out.println("<td>"+paramValue+"</td></tr>\n");
		}
	%>
</table>
</body>
</html>