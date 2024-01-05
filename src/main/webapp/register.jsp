<%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 12/31/2023
  Time: 8:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ثبت نام</title>
    <style>
        <%@include file="./style.css" %>
    </style>
<%--    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>--%>
</head>
<body class="boody">
<div class="home">
    <div class="navb">
        <a href="home.jsp">صفحه اول</a>
        <a href="login.jsp">ورود</a>
        <a href="register.jsp">ثبت نام</a>
        <a href="balance.jsp">کیف پول</a>
    </div>
    <form class="form-register" action="register" method="post" enctype="multipart/form-data">
        <h1>فرم ثبت نام</h1>
        <label> نام </label>
        <input type="text" name="firstname" required>
        <label> نام و نام خانوادگی</label>
        <input type="text" name="lastname" required>
        <label> کد ملی</label>
        <input type="number" name="nationalCode" required>
        <label>شماره همراه</label>
        <input type="text" name="mobileNumber" required>
        <fieldset dir="rtl">
            <legend>آپلود کارت ملی</legend>
            <input type="file" name="pic" accept="image/*" required>
            <input class="submitt" type="submit" value="آپلود" required>
        </fieldset>
        <input class="submit" type="submit" value="ثبت نام">
    </form>
</div>

<%--<script src="register.js"></script>--%>
</body>
</html>
