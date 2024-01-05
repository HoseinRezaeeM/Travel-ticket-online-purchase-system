<%@ page import="travelticketonlinepurchasesystem.util.ApplicationContex" %>
<%@ page import="travelticketonlinepurchasesystem.domin.Ticket" %><%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 1/2/2024
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@include file="./style.css" %>
    </style>
    <title>تایید</title>
</head>
<body class="boody">
<div class="home">
    <div class="navb">
        <a href="home.jsp">صفحه اول</a>
        <a href="login.jsp">ورود</a>
        <a href="register.jsp">ثبت نام</a>
        <a href="balance.jsp">کیف پول</a>
    </div>
        <%
    Ticket ticketBuy = (Ticket) request.getAttribute("ticketBuy");

%>

        <%

       String gen="";
        if(ticketBuy.getGender().equals("مرد")){
               gen ="آقای ";
        }else if(ticketBuy.getGender().equals("زن")){
              gen ="خانم";
        }

%>
    <div class="suces">
        <h2> <%=gen%> <%=ticketBuy.getFullname()%>
        </h2>
        <h2> خرید بلیط شما با موفقیت انجام شد .</h2>
        <h3> شناسه بلیط : <%=ticketBuy.getId()%>
        </h3>
    </div>
</body>
</html>
