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
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"shy-ajax-json.do",
                    data:{
                        name:"zhangsan",
                        age:20
                    },
                    type:"post",
                    dataType:"json",
                    success:function (s) {
/*                        //s从服务器中返回的是json格式的字符串
                       $.each(s,function (i,n) {
                           alert(n.name+" "+n.age)
                       })*/
                             // alert(s);
                        $.html("<p>处理器方法返回String表示视图名称</p>")
                    }
                })
            })
        })
    </script>
</head>
<body>
    <p>处理器方法返回String表示视图名称</p>
    <form action="shy.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="post请求">
    </form>
    <br/>
    <button id="btn">发起ajax请求</button>
</body>
</html>
