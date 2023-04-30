<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 24.12.2022
  Time: 7:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>

<title>Title</title>
</head>
<body>
<h2>Всего произведенных замен у нас</h2>
<form:form action="/countChange" modelAttribute="changeCount"></form:form>

<h2>${changeCount}</h2>

<br><br>
<a href="/ChangeShowShow"> посмотреть информацию о заменах</a>
<br><br>
<a href="/"> главная страница</a>
</body>
</html>
