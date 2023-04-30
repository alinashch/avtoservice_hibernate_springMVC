<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 08.12.2022
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>

    <title>Title</title>
    <style type="text/css">
        TABLE {
            background: white; /* Цвет фона таблицы */
            color: black; /* Цвет текста */
        }
        TD, TH {
            background: white; /* Цвет фона ячеек */
            border: 1px solid #333;
            padding: 5px; /* Поля вокруг текста */
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>имя </th>
        <th>фамилия </th>
        <th>отчество</th>
        <th>номер телефона </th>
        <td>date</td>

        <th> id_repair </th>

    </tr>
    <c:forEach var ="request" items="${allRequest}">
        <tr>
            <c:url var="updateButton" value="/updateInfoRequest">
                <c:param name="RequestID" value="${request.ID_REQUEST}"></c:param>
            </c:url>

            <c:url var="deleteButton" value="/deleteRequest">
                <c:param name="RequestID" value="${request.ID_REQUEST}"></c:param>
            </c:url>
            <td>${request.FIRST_NAME}</td>
            <td>${request.SECOND_NAME}</td>
            <td>${request.THIRD_NAME}</td>
            <td>${request.TELEPHONE}</td>
            <td>${request.REQUEST_DATE}</td>
            <td>${request.id_repair}</td>


            <td><input type="button" value="update" onclick="window.location.href='${updateButton}'">
            </td>

            <td><input type="button" value="delete" onclick="window.location.href='${deleteButton}'">
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add" onclick="window.location.href='/RequestAdd'"/>
<input type="button" value="Count" onclick="window.location.href='/countRequest'"/>
<input type="button" value="SelectEmployees" onclick="window.location.href='/RequestSelectEnter'">

</body>
</html>
