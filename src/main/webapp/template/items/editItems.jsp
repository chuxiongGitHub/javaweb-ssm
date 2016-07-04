<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/4
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>修改商品信息</title>
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath}/items/editItemsSubmit" method="post">
<input type="hidden" name="id" value="${itemsCustomer.id}">

</form>
</body>
</html>
