<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 06.12.2022
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
    <%@ page contentType="text/html; charset=UTF-8" %>

</head>
<body>
<form:form action="/saveSelectEmp" modelAttribute="emp">
    ID <form:input value="1" path="ID_EMPLOYEE"/>

    имя работника <form:input value="null" path="FIRST_NAME_EMPLOYEE"/>
    <br><br>
    фамилия работника <form:input value="null" path="SECOND_NAME_EMPLOYEE"/>
    <br><br>
    отчество работника <form:input  value="null" path="THIRD_NAME_EMPLOYEE"/>
    <br><br>
    дата рождения(формат гггг-мм-дд) <form:input value="1000-09-09" path="DATE_BIRTH_EMPLOYEE"/>
    <br><br>
    город проживания<form:input value="null" path="ADDRESS_EMPLOYEE"/>
    <br><br>
    номер телефона<form:input value="null" path="TELEPHONE_EMPLOYEE"/>
    <br><br>
    должность<form:input value="null" path="POST"/>
    <br><br>
    зарплата<form:input path="SALARY"/>
    <br><br>
    опыт работы <form:input path="EXPERIENCE"/>
    <br><br>
    дни работы<form:input value="null" path="OPERATING_MODE"/>
    <br><br>
    надбавка <form:input path="ALLOWANCE"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>
</body>
</html>
