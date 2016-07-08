
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>批量商品修改</title>
    <link rel="stylesheet" href="res/bootstrap/css/bootstrap.css" type="text/css">
    <script src="res/bootstrap/js/jquery-2.2.2.js"></script>
    <script src="res/bootstrap/js/bootstrap.min.js"></script>
    <script type="application/javascript">
        function editItemsAllSubmit(){
            document.itemsForm.action="${pageContext.request.contextPath }/editItemsAllSubmit";
            document.itemsForm.submit();
        }
        function queryItems(){
            document.itemsForm.action="${pageContext.request.contextPath }/queryItems";
            document.itemsForm.submit();
        }
    </script>

</head>
<body>
<form name="itemsForm" action="${pageContext.request.contextPath }/queryItems" method="post">
    <div>
        <a href="${pageContext.request.contextPath }/form" class="btn bg-primary">新增产品</a>
    </div>
    查询条件：
    <div>
        <input type="text" name="itemsCustomer.name">
        <input type="button" value="查询" class="btn btn-primary" onclick="queryItems();"/>
    </div>
    <div>
        <input type="button" value="批量修改提交" class="btn btn-primary" onclick="editItemsAllSubmit();">
    </div>
    商品列表：
    <table class="table table-striped">
        <tr>

            <th>序号</th>
            <th>商品名称</th>
            <th>商品价格</th>
            <th>生产日期</th>
            <th>商品描述</th>
        </tr>
        <c:forEach items="${itemsList}" var="data" varStatus="status">
            <tr>

                <td></td>
                <td><input name="itemsList[${status.index}].name" value="${data.name }"></td>
                <td><input name="itemsList[${status.index}].price" value="${data.price }"></td>
                <td><input name="itemsList[${status.index}].createtime" value="<fmt:formatDate value="${data.createtime}" pattern="yyyy-MM-dd"/>"></td>
                <td><input name="itemsList[${status.index}].detail" value="${data.detail }"></td>

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