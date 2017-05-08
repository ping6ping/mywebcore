<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8") ;  %>
    <%@ page import="zhangyuliang.*" %>
    <jsp:useBean id="NBA" class="zhangyuliang.NBAteam" scope="page" >
    <jsp:setProperty name="NBA" property="teamname" param="teamname"/>
    <jsp:setProperty name="NBA" property="mainplayer" param="mainplayer"/>
  </jsp:useBean> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>球队信息列表</p>
<br>
<span>球队:</span><jsp:getProperty property="teamname" name="NBA"/>
<br>
<span>球星:</span><jsp:getProperty property="mainplayer" name="NBA"/>
<br>
</body>
</html>