<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 23.12.2022
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
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

    <th>дата</th>
  </tr>
  <c:forEach var ="Repair" items="${allRepair}">
    <tr>
      <c:url var="updateButton" value="/updateInfoRepair">
        <c:param name="RepairID" value="${Repair.id_repair}"></c:param>
      </c:url>

      <c:url var="deleteButton" value="/deleteRepair">
        <c:param name="RepairID" value="${Repair.id_repair}"></c:param>
      </c:url>

      <td>${Repair.repair_date}</td>

      <td><input type="button" value="update" onclick="window.location.href='${updateButton}'">
      </td>

      <td><input type="button" value="delete" onclick="window.location.href='${deleteButton}'">
      </td>
    </tr>
  </c:forEach>
</table>
<br>
<input type="button" value="Add" onclick="window.location.href='/RepairAdd'"/>


</body>
</html>
