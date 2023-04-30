<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 08.12.2022
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>

    <title>Title</title>
</head>
<body>
        <form:form action="/saveChange" modelAttribute="change" >

    <form:hidden path="ID_CHANGE"/>

    дата ремонта <form:input path="DATE_PRODUCTION"/>
    <br><br>
    марка детали <form:input path="NAME_DETAIL"/>
    <br><br>
    номер детали <form:input path="NUMBER_DETAIL"/>
    <br><br>

    <br><br>

    <form:select  path="id_repair">
        <c:forEach var ="arr" items="${arr}">
        <option>${arr}</option>
        </c:forEach>
    </form:select>

    <input type="submit" value="OK">
    </form:form>


</body>
</html>
