<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 24.12.2022
  Time: 7:33
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
  <%@ page contentType="text/html; charset=UTF-8" %>

  <title>Title</title>
</head>
<body>
<h2>Всего заявок у нас</h2>
<form:form action="/countRequest" modelAttribute="RequestCount"></form:form>

<h2>${RequestCount}</h2>

<br><br>
<a href="/RequestShowShow"> посмотреть информацию о заявках</a>
<br><br>
<a href="/"> главная страница</a>
</body>
</html>
