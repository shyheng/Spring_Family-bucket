<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020/7/3
  Time: 10:49
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
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<p>当方法返回ModelAndView实现forward</p>
   <form action="doRedirect.do" method="post">
       姓名：<input type="text" name="name"/><br/>
       年龄：<input type="text" name="age"><br/>
       <input type="submit" value="提交请求"/>
   </form>
</body>
</html>
