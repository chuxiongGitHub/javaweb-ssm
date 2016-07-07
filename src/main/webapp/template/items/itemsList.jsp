
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
	<link rel="stylesheet" href="res/bootstrap/css/bootstrap.css" type="text/css">
	<script src="res/bootstrap/js/jquery-2.2.2.js"></script>
	<script src="res/bootstrap/js/bootstrap.min.js"></script>
</head>
<body> 
<form action="${pageContext.request.contextPath }/queryItems" method="post">
	<div>
		<a href="template/items/itemsForm.jsp" class="btn bg-primary">新增产品</a>
	</div>
查询条件：
	<div>
		<input type="text">
		<input type="submit" value="查询" class="btn btn-primary"/>
	</div>
商品列表：
<table class="table table-striped">
<tr>
	<td>序号</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemsList}" var="data">
<tr>
	<td></td>
	<td>${data.name }</td>
	<td>${data.price }</td>
	<td><fmt:formatDate value="${data.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${data.detail }</td>
	
	<td><a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath }/editItems?id=${data.id}">修改</a>
		<a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath }/editItems?id=${data.id}">删除</a>
	</td>

</tr>
</c:forEach>

</table>
</form>
<script type="text/javascript">
	$(function(){
		var len=$('table tr').length;
		console.log(len);
		for(var i=1;i<len;i++){
			$('table tr:eq('+i+') td:first').text(i);
		}
	});
</script>
</body>

</html>