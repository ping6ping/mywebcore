<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">.liang:hover{text-decoration:none;color: red;}</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if (session.getAttribute("userid")!=null){ %>
<h3>欢迎<%= session.getAttribute("userid") %>来到本网站,<a class="liang" href="logout.jsp">注销</a></h3>
<%
}else
{%>
<h3>请先进行系统的登录<a href="cook.jsp">登录</a>!</h3>
<%} %>
</body>
</html>