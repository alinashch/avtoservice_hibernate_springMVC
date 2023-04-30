<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 24.12.2022
  Time: 7:11
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <%@ page contentType="text/html; charset=UTF-8" %>

</head>
<body>
<form:form action="/saveSelectChange" modelAttribute="change">
  id <form:input value="1" path="ID_CHANGE"/>

  дата ремонта <form:input  value ="1000-09-09"    path="DATE_PRODUCTION"/>
  <br><br>
  марка детали <form:input value ="null"  path="NAME_DETAIL"/>
  <br><br>
  номер детали <form:input value="0" path="NUMBER_DETAIL"/>
  <br><br>
  id_repair <form:input value="1" path="id_repair"/>
  <br><br>
  <input type="submit" value="OK">

</form:form>
</body>
</html>
