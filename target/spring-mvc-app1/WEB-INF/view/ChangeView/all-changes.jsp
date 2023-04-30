<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 08.12.2022
  Time: 11:41
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

    <th>дата ремонта</th>
    <th>марка детали</th>
    <th>номер детали</th>
    <th>id_repair</th>

  </tr>
  <c:forEach var ="change" items="${allChange}">
    <c:url var="updateButton" value="/updateInfoChange">
      <c:param name="ChangeID" value="${change.ID_CHANGE}"></c:param>
    </c:url>

    <c:url var="deleteButton" value="/deleteChange">
      <c:param name="ChangeID" value="${change.ID_CHANGE}"></c:param>
    </c:url>
    <tr>

      <td>${change.DATE_PRODUCTION}</td>
      <td>${change.NAME_DETAIL}</td>
      <td>${change.NUMBER_DETAIL}</td>
      <td>${change.id_repair}</td>

      <td><input type="button" value="update" onclick="window.location.href='${updateButton}'">
      </td>
      <td><input type="button" value="delete" onclick="window.location.href='${deleteButton}'">
      </td>
    </tr>
  </c:forEach>
</table>
<br>

<input type="button" value="Add" onclick="window.location.href='/ChangeAdd'"/>
<input type="button" value="Count" onclick="window.location.href='/countChange'"/>
<input type="button" value="SelectEmployees" onclick="window.location.href='/ChangeSelectEnter'">

</body>
</html>
