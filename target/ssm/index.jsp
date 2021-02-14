<%--
  Created by IntelliJ IDEA.
  User: Chloe
  Date: 2021/2/4
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
<h1>spring mvc测试</h1>
    <form action="/Client/AddClient" method="post">
    客户编号：<input type="number" name="clientid" /><br>
    客户姓名：<input type="text" name="clientname" /><br>
    联系方式：<input type="text" name="clientcontact" /><br>
    客户简介：<input type="text" name="clientintroduction" /><br>
    <input type="submit" value="提交" />
    </form>
</body>
</html>
