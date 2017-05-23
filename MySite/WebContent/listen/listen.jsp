<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% /* application.setAttribute("name", "张玉良");
   application.setAttribute("name", "hehehe"); */
   session.setAttribute("火箭", "哈登");
   session.setAttribute("火箭", "威少");
   session.removeAttribute("火箭");
   
%>
<a href="<%= request.getContextPath() %>/sessiondemo">手动销毁</a>
</body>
</html>