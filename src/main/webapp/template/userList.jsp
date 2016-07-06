<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/18
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<html>

<head>
    <title>用户列表</title>

    <link type="text/css" rel="stylesheet" href="res/css/bootstrap.css">
</head>
<body>
<table class="table table-bordered table-hover"></table>
<form action="${pageContext.request.contextPath}/userList" method="post">
    <table border="1">
        <tr>
            <th>用户名</th>
            <th>密码</th>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.username}</td>
                <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            </tr>
        </c:forEach>

    </table>

</form>

</body>
</html>
