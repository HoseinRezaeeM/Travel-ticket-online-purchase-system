<%@ page import="travelticketonlinepurchasesystem.domin.Ticket" %>
<%@ page import="java.util.Optional" %>
<%@ page import="travelticketonlinepurchasesystem.util.ApplicationContex" %>
<%@ page import="travelticketonlinepurchasesystem.domin.Trip" %><%--
  Created by IntelliJ IDEA.
  User: sp
  Date: 1/2/2024
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@include file="../cssfile/style.css" %>
    </style>
</head>
<body class="boody">
<%
    Optional<Ticket> optional = (Optional<Ticket>) request.getAttribute("optional");
    final var byId = ApplicationContex.getTripServiceImpl().findById(optional.get().getTrip().getId());

%>
<div class="home">
    <div class="navb">
        <a href="home.jsp">صفحه اول</a>
        <a href="login.jsp">ورود</a>
        <a href="register.jsp">ثبت نام</a>
        <a href="balance.jsp">کیف پول</a>
    </div>
    <div class="triplist">
        <table class="blueTable">
            <thead>
            <tr>
                <td></td>
                <td>اطلاعات بلیط</td>
            </tr>
            </thead>
            <%
                if (optional.isPresent()) {
            %>
            <tbody>
            <tr>
                <td><%=optional.get().getId()%>
                </td>
                <td>شناسه بلیط</td>
            </tr>
            <tr>
                <td><%=optional.get().getFullname()%>
                </td>
                <td>نام</td>
            </tr>
            <tr>
                <td><%=optional.get().getGender()%>
                </td>
                <td>جنسیت</td>
            </tr>
            <tr>
                <td><%=byId.get().getOrigin()%>
                </td>
                <td>مبدا</td>
            </tr>
            <tr>
                <td><%=byId.get().getDestination()%>
                </td>
                <td>مقصد</td>
            </tr>
            <tr>
                <td><%=byId.get().getStartDate()%>
                </td>
                <td>تاریخ حرکت</td>
            </tr>
            <tr>
                <td><%=byId.get().getStartTime()%>
                </td>
                <td>ساعت حرکت</td>
            </tr>
            <tr>
                <td><%=byId.get().getId()%>
                </td>
                <td>شناسه سفر</td>
            </tr>
            </tbody>
            <%}%>
            <tfoot>
            <td>
                <form action="del" method="post"><input type="submit" value="لغو بلیط"></form>
            </td>
            </tfoot>
        </table>
    </div>
</div>
</body>
</html>
