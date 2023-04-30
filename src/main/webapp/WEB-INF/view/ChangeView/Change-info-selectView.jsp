<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 24.12.2022
  Time: 7:11
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>

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

    <tr>

      <td>${change.DATE_PRODUCTION}</td>
      <td>${change.NAME_DETAIL}</td>
      <td>${change.NUMBER_DETAIL}</td>
      <td>${change.id_repair}</td>

    </tr>
  </c:forEach>
</table>
</body>
</html>
