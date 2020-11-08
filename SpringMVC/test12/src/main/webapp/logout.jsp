<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020/7/5
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    退出系统，从session中删除数据
    <%
        session.removeAttribute("name");
    %>
</body>
</html>
