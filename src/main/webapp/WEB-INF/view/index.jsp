<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <title>DAB工具箱</title>
</head>
<body>
<a href="/login">登录</a>
</body>
</html>
