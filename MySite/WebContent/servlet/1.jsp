<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="form1" method="get" action="<%=request.getContextPath()%>/zhang/liangliang">
姓名<input name="userName" type="text" size="12">
<br> 
密码
<input name="password" type="password" size="12">
<br>
<input type="submit" name
="Submit" value="提交">
<input type="reset" name="Submit2" value="重置">
</form>
<% session.setAttribute("name", "张玉良");
   session.setAttribute("age", 23);%>
   
</body>
</html>