<%--
  Created by IntelliJ IDEA.
  User: Chloe
  Date: 2021/2/5
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户个人信息页面</title>
</head>
<body>
    <%-- 显示登录页面获取的用户个人新 --%>
    <%-- 更新客户信息【限制：职位编号、所属的团队编号普通员工不可以修改】 --%>
    <h1>用户个人信息页面</h1>
    <table border="1">
        <tr>
            <%-- 无法直接获取本地图片 --%>
            <td>头像：<img src="file:///+${curStaff.staffimg}" width="100px" height="100px"/></td>
        </tr>
        <tr>
            <td>账号名：<input type="text" name="staffcode" value="${curStaff.staffcode}"/></td>
            <td>性别：<input type="text" name="staffsex" value="${curStaff.staffsex}"/></td>
        </tr>
        <tr>
            <td>编号：<input type="text" name="staffid" value="${curStaff.staffid}" disabled="disabled"/></td>
            <td>姓名：<input type="text" name="staffname" value="${curStaff.staffname}"/></td>
        </tr>
       <%-- <tr>
            <td>职位：<input type="text" name="rolename" value="${curStaff.rolename}"/></td>
            <td>出生日期：<input type="date" name="staffbirthda" value="${curStaff.staffbirthda}"/></td>
        </tr>
        <tr>
            <td>团队：<input type="text" name="groupid" value="${curStaff.groupid}"/></td>
            <td>联系方式：<input type="text" name="staffphone" value="${curStaff.staffphone}"/></td>
        </tr>
        <tr>
            <td>工作区域：<input type="text" name="staffarea" value="${curStaff.staffarea}"/></td>
            <td>邮箱：<input type="text" name="staffemail" value="${curStaff.staffemail}"/></td>
        </tr>
        <tr>
            <td>入职时间：<input type="date" name="staffentryjob" value="${curStaff.staffentryjob}"/></td>
            <td></td>
        </tr>
        <tr>
            <td>离职时间：<input type="date" name="staffresignatejob" value="${curStaff.staffresignatejob}"/></td>
            <td></td>
        </tr>--%>
    </table>
</body>
</html>
