<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Chloe
  Date: 2021/2/4
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>响应 test_springmvc </title>
</head>
<body>
    <h1>客户信息表单</h1>
    <c:forEach items="${allclients}" var="v">
        ${v.toString()}<br>
    </c:forEach>
</body>
</html>
