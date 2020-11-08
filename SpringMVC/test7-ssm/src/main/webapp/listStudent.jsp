<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020/7/4
  Time: 20:38
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
    <title>查询学生</title>
    <base href="<%=basePath%>"/>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            //在当前页面dom对象加载之后再行loadStudentData

            loadStudentData();
            $("#bnt").click(function () {
                //点击的时候，等同于刷新
                loadStudentData();
            })
        })
        
        function loadStudentData() {
            $.ajax({
                url:"student/queryStudent.do",
                type:"post",
                dataType:"json",
                success:function (data) {
                    //删除数据
                    $("#info").html("");
                    //增加新数据
                    $.each(data,function (i,n) {
                        $("#info").append("<tr>")
                            .append("<td>"+n.id+"<td>")
                            .append("<td>"+n.name+"<td>")
                            .append("<td>"+n.age+"<td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
    <div align="center">
        <table>
            <thead>
            <tr>
                <td>学号</td>
                <td>姓名</td>
                <td>年龄</td>
            </tr>
            </thead>
            <tbody id="info">

            </tbody>
        </table>
        <input type="button" id="bnt" value="查询学生"/>
    </div>
</body>
</html>
