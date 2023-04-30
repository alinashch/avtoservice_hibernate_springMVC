<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 24.12.2022
  Time: 7:36
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
        <th>отномерчество</th>
        <th> телефона </th>
        <td>date</td>
        <th> id_repair </th>

    </tr>
    <c:forEach var ="request" items="${allRequest}">
        <tr>

            <td>${request.FIRST_NAME}</td>
            <td>${request.SECOND_NAME}</td>
            <td>${request.THIRD_NAME}</td>
            <td>${request.TELEPHONE}</td>
            <td>${request.REQUEST_DATE}</td>
            <td>${request.id_repair}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
