<html >
<head>
    <meta charset="UTF-8">
    <title>注册</title>
</head>
<body>
<#include "/common/head.ftl">
<form action="/user/addUser" method="post">
    用户名: <input type="text" placeholder="请输入用户名" name="userName" required="required" /> <br/>
    密码: <input type="password" placeholder="请输入密码" name="passWord" required="required"  /> <br/>
    <button type="submit">
        注册
    </button>

</form>
</body>
</html>