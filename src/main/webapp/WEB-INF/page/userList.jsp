<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/18
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>用户列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/page/userList" method="post">
    <table border="1">
        <tr>
            <th>用户名</th>
            <th>密码</th>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.userName}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>

    </table>

</form>
</body>
</html>
