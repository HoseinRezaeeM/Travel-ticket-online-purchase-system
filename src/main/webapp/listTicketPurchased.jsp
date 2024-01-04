<%@ page import="travelticketonlinepurchasesystem.domin.Ticket" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 1/2/2024
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style><%@include file="./style.css"%></style>
    <title>لیست بلیط خریداری شده </title>
</head>
<body class="trip-list">
<div class="home">
    <div class="navb">
        <a href="home.jsp">صفحه اول</a>
        <a href="login.jsp">ورود</a>
        <a href="register.jsp">ثبت نام</a>
        <a href="balance.jsp">کیف پول</a>
    </div>
<div class="triplist">
<%
    List<Ticket> purchase = (List<Ticket>) request.getAttribute("purch");
%>
    <% if (purchase != null && !purchase.isEmpty()) { %>
    <h1>لیست بلیط خریداری شده </h1>
    <table class="zui-table">
        <thead>
        <tr>
            <th>تاریخ</th>
            <th>شناسه بلیط</th>
            <th>انتخاب</th>
        </tr>
        </thead>
        <% for (Ticket ti : purchase) { %>
        <tbody>
        <tr>
            <td><%=ti.getPurchaseData()%></td>
            <td><%=ti.getId()%></td>
            <td><form action="see" method="get"> <input type="submit"  name="idTic" value="<%=ti.getId()%>"></form></td>
        </tr>
        <% } %>
        </tbody>
    </table>
    <% } else { %>
    <div class="noexist"><h2> لیست خریدی موجود نیست  </h2></div>
    <% } %>
</div>
</div>
</body>
</html>
