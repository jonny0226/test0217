<%--
  Created by IntelliJ IDEA.
  User: jonny
  Date: 2019/11/26
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>传递请求参数的页面</title>
</head>
<body>


    <form action="/user/login" method="post">
        用户名<input type="text" name="username"> <br>
        生日<input type="text" name="birthday"> <br>
        地址<input type="text" name="address"> <br>
        用户的第一个账号aid<<input type="text" name="accountList[0].aid" ><br>
        用户的第一个账号money<<input type="text" name="accountList[0].money" ><br>
        用户的第二个账号aid<<input type="text" name="accountList[1].aid" ><br>
        用户的第二个账号money<<input type="text" name="accountList[1].money" ><br>
        兴趣爱好<input type="checkbox" name="hobby" value="sing">唱
        <input type="checkbox" name="hobby" value="jump">跳
        <input type="checkbox" name="hobby" value="run">跑<br>
        <input type="submit">
    </form>
</body>
</html>
