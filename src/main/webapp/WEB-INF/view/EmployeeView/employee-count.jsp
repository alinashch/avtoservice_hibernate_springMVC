<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 10.12.2022
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>

    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
<h2>Всего работников у нас</h2>
<form:form action="/countEmp" modelAttribute="employeeCount"></form:form>

<h2>${employeeCount}</h2>

<br><br>
<a href="/empShow"> посмотреть информацию о работниках</a>
<br><br>
<a href="/"> главная страница</a>


</body>
</html>
