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
<form id="itemForm" action="${pageContext.request.contextPath}/editItemsSubmit" method="get">
<input type="hidden" name="id" value="${itemsCustomer.id}">
    修改商品信息：
<table width="100%" border="1">
<tr>
    <td>商品名称</td>
    <td><input type="text" name="name" value="${itemsCustomer.name}"></td>
</tr>
    <tr>
        <td>商品价格</td>
        <td><input type="text" name="price" value="${itemsCustomer.price}"></td>
    </tr>
    <tr>
        <td>商品简介</td>
        <td><input type="text" name="detail" value="${itemsCustomer.detail}"></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="提交">
        </td>
    </tr>
</table>
</form>
</body>
</html>
