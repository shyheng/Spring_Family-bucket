<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020/7/4
  Time: 19:52
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
    <title>注册表</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <div align="center">
        <form action="student/addStudent.do" method="post">
            <table>
                <tr>
                    <td>姓名：</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>年龄：</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="提交"></td>
                    <td><input type="reset" value="重置"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
