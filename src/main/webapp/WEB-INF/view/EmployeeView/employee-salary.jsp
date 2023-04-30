<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 20.12.2022
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>

    <title>Title</title>
</head>
<body>
<br><br>

<h2>Максимальная зарплата</h2>
<form:form action="/EmpSalaryStatistic" modelAttribute="emloyeeMaxSalary"></form:form>

<h2>${emloyeeMaxSalary}</h2>
<br><br>
<h2>Минимальная зарплата</h2>
<form:form action="/EmpSalaryStatistic" modelAttribute="employeeMinSalary"></form:form>
<h2>${employeeMinSalary}</h2>
<br><br>
<h2>Средняя зарплата</h2>
<form:form action="/EmpSalaryStatistic" modelAttribute="employeeAvgsalary"></form:form>
<h2>${employeeAvgsalary}</h2>
<br><br>
<h2>Суммарная зарплата</h2>
<form:form action="/EmpSalaryStatistic" modelAttribute="employeeTotalsalary"></form:form>
<h2>${employeeTotalsalary}</h2>
<br><br>
<a href="/empShow"> посмотреть информацию о работниках</a>


<br><br>
<a href="/"> главная страница</a>

</body>
</html>
