<%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 1/1/2024
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@include file="../cssfile/style.css" %>
    </style>
    <title>تکمیل اطلاعات مسافر</title>
</head>
<body class="boody">
<div class="home">
    <div class="navb">
        <a href="home.jsp">صفحه اول</a>
        <a href="login.jsp">ورود</a>
        <a href="register.jsp">ثبت نام</a>
        <a href="balance.jsp">کیف پول</a>
    </div>
    <div class="ti"><h1> اطلاعات مسافر </h1></div>

    <form class="buye" action="ticket" method="post">
        <label>نام و نام خانوادگی مسافر</label>
        <input type="text" name="fullname" required>
        <label class="gend"> جنسیت</label>
        <div>
        <input type="radio" name="gender" value="زن" required>مرد
        <input type="radio" name="gender" value="مرد" required>زن</div>
        <label>شماره همراه خریدار</label>
        <input type="text" name="mobileNumber" required>
        <input class="taeed" type="submit" value="تایید">
    </form>
</div>
</body>
</html>
