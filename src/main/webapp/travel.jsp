<%@ page import="travelticketonlinepurchasesystem.util.ApplicationContex" %><%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 12/31/2023
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style><%@include file="./style.css"%></style>
</head>
<body class="boody">
<div class="home">
    <div class="navb">
        <a href="home.jsp">صفحه اول</a>
        <a href="login.jsp">ورود</a>
        <a href="register.jsp">ثبت نام</a>
        <a href="balance.jsp">کیف پول</a>
    </div>
    <div class="tickett">
        <form action="purchase" method="get">
        <input type="submit" value="لیست بلیط های خریداری شده"></form>
        <form action="update" method="get">
        <input type="submit" value="                ویرایش اطلاعات"></form>
        <form action="bank" method="get">
            <input type="submit"  value="      افزایش موجودی کیف پول"></form>
    </div>

    <div class="trip-form">
        <form class="form-travelno" action="trip" method="get">
            <label>نوع وسیله
                <select id="vehicle" name="vehicleType">
                    <option value="">لطفا وسیله را انتخاب نمایید</option>
                    <option value="هواپیما">هواپیما</option>
                    <option value="قطار">قطار</option>
                    <option value="اتوبوس">اتوبوس</option>
                </select></label>
            <label>مبدا
                <select id="origin" name="origin" accesskey="">
                    <option value="">لطفا مبدا را انتخاب نمایید</option>
                    <option value="تهران">تهران</option>
                    <option value="اصفهان">اصفهان</option>
                    <option value="تبریز">تبریز</option>
                    <option value="مشهد">مشهد</option>
                </select></label>
            <label>مقصد
                <select id="destination" name="destination">
                    <option value="">لطفا مقصد را انتخاب نمایید</option>
                    <option value="تهران">تهران</option>
                    <option value="اصفهان">اصفهان</option>
                    <option value="تبریز">تبریز</option>
                    <option value="مشهد">مشهد</option>
                </select></label>
            <label>تاریخ حرکت
                <input class="date" type="date" name="startDate" min="2024-01-01" max="2025-01-30"/></label>
            <input class="search" type="submit" value="جستجو">
        </form>
    </div>
</div>
</body>
</html>
