<%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 12/31/2023
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style><%@include file="./style.css"%></style>
    <title>سامانه فروش آنلاین بلیط</title>

</head>
<body  class="boody">
<div class="home">
    <div class="navb">
        <a href="home.jsp">صفحه اول</a>
        <a href="login.jsp">ورود</a>
        <a href="register.jsp">ثبت نام</a>
        <a href="balance.jsp">کیف پول</a>
    </div>

<form class="form" action="login" method="post">
    <h1>ورود به سیستم </h1>
    <input type="text" placeholder="نام کاربری" name="username" required>
    <input type="password" placeholder="رمز عبور" name="password" required>
    <input class="vorod" type="submit" value="ورود">
</form>
</div>
</body>
</html>
