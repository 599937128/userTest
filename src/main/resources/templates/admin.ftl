<html >
<head>
    <meta charset="UTF-8">
    <title>管理</title>
</head>
<body>
<#include "/common/head.ftl">
<table>
    <tr>
        <td>id</td>
        <td>用户名</td>
        <td>性别</td>
        <td>地址</td>
        <td colspan="2">管理</td>
    </tr>

        <#list users as us>
        <tr>
            <td>${us.id}</td>
            <td>${us.userName}</td>
            <td>${us.sex!'男'}</td>
            <td>${us.address!'北京'}</td>
            <td><a href="/user/deleteUser?id=${us.id}">删除</a></td>
            <td><a href="/user/update?id=${us.id}">修改</a></td>
        </tr>
        </#list>

</table>
</body>
</html>