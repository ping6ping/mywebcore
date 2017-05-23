<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    response.setHeader("refresh", "2");
    Set all =(Set)this.getServletContext().getAttribute("user");
    String time = new Date().toLocaleString();
    %>
    <p>当前的时间为 <%=time %></p>
    <p>当前的人数为 <%=all.size() %><p>
    <p>当前的在线人数为<%
	Iterator iter = all.iterator();
	while(iter.hasNext()){
%>		
		<%= iter.next()%>
<%		
	}

%>
</body>
</html>