<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="/loginAction" method="get">
    <input type="text" name="loginname"/>
    <input type="password" name="loginpwd"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
