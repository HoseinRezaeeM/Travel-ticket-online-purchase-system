<%@ page import="travelticketonlinepurchasesystem.domin.Trip" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 1/1/2024
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>لیست سفر ها</title>
    <style><%@include file="../cssfile/style.css"%></style>
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
        response.setHeader("cache-control","no-store");
        List<Trip> tripsList = (List<Trip>) request.getAttribute("tripsList");
    %>

    <% if (tripsList != null && !tripsList.isEmpty()) { %>
    <h1>لیست سفر ها</h1>
    <table class="zui-table">
        <thead>
        <tr>
            <th>    مسیر<%=tripsList.get(0).getDestination()%> - <%=tripsList.get(0).getOrigin()%> </th>
            <th><%=tripsList.get(0).getStartDate()%> تاریخ حرکت    </th>
            <th><%=tripsList.get(0).getVehicleType()%></th>

        </tr>
        <tr>
            <th>شناسه سفر</th>
            <th>ساعت حرکت</th>
            <th>انتخاب</th>
        </tr>
        </thead>
        <% for (Trip tr : tripsList) { %>
        <tbody>
        <tr>
            <td><%=tr.getId() %></td>
            <td><%=tr.getStartTime()%></td>
            <td><a type="button" href="ticket.jsp">خرید</a></td>
        </tr>
        <% } %>
        </tbody>
    </table>
    <% } else { %>
    <div class="noexist"><h2> سفری موجود نیست </h2></div>
    <% } %>
</div>
</div>
</body>
</html>
