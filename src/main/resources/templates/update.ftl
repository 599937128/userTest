<html >
<head>
    <meta charset="UTF-8">
    <title>管理</title>
</head>
<body>
<#include "/common/head.ftl">
<form action="/user/updateUser" method="post">
    用户名: <input type="text"  name="userName" value="${user.userName}" disabled="disabled"/><br/>
    性别: <input name="sex" type="radio" value="男"
<#if ('男'== user.sex)>
    checked="checked"
</#if>> 男
    性别: <input name="sex" type="radio" value="女"
<#if ('女'== user.sex)>
               checked="checked"
</#if>> 女
    <br>
    地址: <input type="text"  name="address" value="${user.address!'北京'}" /> <br/>
    <input type="text" name="id" value="${user.id}" hidden>
    <button type="submit">
        提交修改
    </button>

</form>
</body>
</html>