<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 08.12.2022
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>

    <title>Title</title>
</head>
<body>
<form:form action="/saveRequest" modelAttribute="request">
    <form:hidden path="ID_REQUEST"/>

    имя  <form:input path="FIRST_NAME"/>
    <br><br>
    фамилия <form:input path="SECOND_NAME"/>
    <br><br>
    отчество <form:input path="THIRD_NAME"/>
    <br><br>
    номер телефона<form:input path="TELEPHONE"/>
    <br><br>
    дата<form:input path="REQUEST_DATE"/>
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
