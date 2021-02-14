<%--
  Created by IntelliJ IDEA.
  User: Chloe
  Date: 2021/2/5
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页+登录页面</title>
    <link rel="stylesheet" type="text/css" href="/css/Login.css">
</head>
<body>
    <%-- 登录框：登录信息 * 登录验证 * 进入主页面 --%>
    <div class="box">
        <h2>登 录</h2>
        <form class="frm_box" action="/LoginController/CheckCode" method="post">
            <div class="frm_font">
            <input type="text" id="username" name="username"/>
            <label>用户名</label>
            </div>

            <div class="frm_font">
            <input type="password" id="userpwd" name="userpwd"/>
            <label>密 码</label>
            </div>

            <div class="frm_submit">
                <input type="submit" id="submit" value="提交"/>
            </div>
        </form>
    </div>
</body>
</html>
