<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 21.12.2022
  Time: 1:19
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
        <th>Имя сотрудника</th>
        <th>Фамилия сотрудника</th>
        <th>Отчество сотрудника</th>
        <th>Дата рождения сотрудника</th>
        <th>город проживания сотрудника</th>
        <th>номер телефона</th>
        <th>должность</th>
        <th>зарплата</th>
        <th>опыт работы </th>
        <th>дни работы</th>
        <th>надбавка </th>
    </tr>
    <c:forEach var ="emp" items="${allEmp}">
        <tr>

            <td>${emp.FIRST_NAME_EMPLOYEE}</td>
            <td>${emp.SECOND_NAME_EMPLOYEE}</td>
            <td>${emp.THIRD_NAME_EMPLOYEE}</td>
            <td>${emp.DATE_BIRTH_EMPLOYEE}</td>
            <td>${emp.ADDRESS_EMPLOYEE}</td>
            <td>${emp.TELEPHONE_EMPLOYEE}</td>
            <td>${emp.POST}</td>
            <td>${emp.SALARY}</td>
            <td>${emp.EXPERIENCE}</td>
            <td>${emp.OPERATING_MODE}</td>
            <td>${emp.ALLOWANCE}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
