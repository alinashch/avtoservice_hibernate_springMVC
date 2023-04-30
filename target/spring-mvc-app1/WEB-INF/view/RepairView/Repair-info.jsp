<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alina
  Date: 23.12.2022
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>

<title>Title</title>
</head>
<body>
<form:form action="/saveRepair" modelAttribute="Repair">
    <form:hidden path="id_repair"/>


    date <form:input path="repair_date"/>


    <input type="submit" value="OK">

</form:form>
</body>
</html>
