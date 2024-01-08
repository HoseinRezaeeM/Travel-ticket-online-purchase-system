<%@ page import="travelticketonlinepurchasesystem.util.ApplicationContex" %>
<%@ page import="java.io.OutputStream" %><%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 1/1/2024
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
    <style><%@include file="../cssfile/style.css"%></style>
</head>
<body>
<div class="home">

    <div class="navb">
        <a href="home.jsp">صفحه اول</a>
        <a href="login.jsp">ورود</a>
        <a href="register.jsp">ثبت نام</a>
        <a href="balance.jsp">کیف پول</a>
        <div class="Deve">
      <h3>Develope By : Hosein Rezaei</h3></div>
    </div>

    <div id="carouselExampleCaptions" class="carousel slide">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                    aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                    aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                    aria-label="Slide 3"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3"
                    aria-label="Slide 4"></button>
        </div>
        <div class="carousel-inner justify-content-end">
            <div class="carousel-item active">
                <img src="../image/travel-04.jpg" height="550" class="d-block w-100" alt="...">
                <div class="carousel-caption">
                    <h5>بزن بریم سفر </h5>
                    <a type="button" href="register.jsp" class="btn btn-primary btn-lg">ثبت نام</a>
                </div>
            </div>
            <div class="carousel-item">
                <img src="../image/Traveling.jpg" height="550"
                     class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
            <div class="carousel-item">
                <img src="../image/Sunbather-in-chair.jpg" height="550" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
                data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
                data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
    <div class="trip-form">
        <form class="form-travel" action="trip" method="get">
            <label>نوع وسیله
                <select id="vehicle" name="vehicleType" required>
                    <option value="">لطفا وسیله را انتخاب نمایید</option>
                    <option value="هواپیما">هواپیما</option>
                    <option value="قطار">قطار</option>
                    <option value="اتوبوس">اتوبوس</option>
                </select></label>
            <label>مبدا
                <select id="origin" name="origin" accesskey="" required>
                    <option value="">لطفا مبدا را انتخاب نمایید</option>
                    <option value="تهران">تهران</option>
                    <option value="اصفهان">اصفهان</option>
                    <option value="تبریز">تبریز</option>
                    <option value="مشهد">مشهد</option>
                </select></label>
            <label>مقصد
                <select id="destination" name="destination" required>
                    <option value="">لطفا مقصد را انتخاب نمایید</option>
                    <option value="تهران">تهران</option>
                    <option value="اصفهان">اصفهان</option>
                    <option value="تبریز">تبریز</option>
                    <option value="مشهد">مشهد</option>
                </select></label>
            <label>تاریخ حرکت
                <input class="date" type="date" name="startDate" min="2024-01-01" max="2025-01-30" required/></label>
            <input class="search" type="submit" value="جستجو">
        </form>
    </div>
</div>
</body>
</html>
