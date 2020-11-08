<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020/7/3
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>第一个SpringMVC的项目</p>
    <form action="receiveproperty.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="get请求">
    </form>

    <p>请求参数名和处理器方法的形参名不一样</p>
    <form action="shy.do" method="post">
        姓名：<input type="text" name="rname"><br/>
        年龄：<input type="text" name="rage"><br/>
        <input type="submit" value="post请求">
    </form>

    <p>用java对象接受请求参数，简写</p>
    <form action="shy1.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="post请求">
    </form>
</body>
</html>
