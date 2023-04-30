<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 24.12.2022
  Time: 7:36
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
  <%@ page contentType="text/html; charset=UTF-8" %>

  <title>Title</title>
</head>
<body>
<form:form action="/saveSelectRequest" modelAttribute="Request">
  id <form:input value="1" path="ID_REQUEST"/>
<br>
  имя  <form:input value= "null" path="FIRST_NAME"/>
  <br><br>
  фамилия <form:input value= "null" path="SECOND_NAME"/>
  <br><br>
  отчество <form:input value= "null" path="THIRD_NAME"/>
  <br><br>
  номер телефона<form:input value= "null" path="TELEPHONE"/>
  <br><br>
  дата<form:input value="1000-09-09" path="REQUEST_DATE"/>
  <br><br>
  id_repair<form:input value="1" path="id_repair"/>
  <br><br>

  <input type="submit" value="OK">

</form:form>
</body>

</body>
</html>
