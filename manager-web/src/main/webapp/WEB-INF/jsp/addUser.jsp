<%--
  Created by IntelliJ IDEA.
  User: yewei
  Date: 2019/11/26
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓名：<input type="text" name="userName"/><br/>
        年龄：<input type="text" name="userAge"/><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
