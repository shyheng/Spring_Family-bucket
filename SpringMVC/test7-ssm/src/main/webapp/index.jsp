<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020/7/4
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>功能入口</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <div align="center">
        <p>SSM整合的eg</p>
        <img src="img/mm.jpg"/>
        <table>
            <tr>
                <td><a href="addStudent.jsp"/> 注册学生</td>
            </tr>
            <tr>
                <td><a href="listStudent.jsp"/> 浏览学生</td>
            </tr>
        </table>
    </div>
</body>
</html>
