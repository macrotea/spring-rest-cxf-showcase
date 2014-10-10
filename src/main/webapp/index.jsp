<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="zh-cmn-Hans-CN">
    <head>
    <title>spring-rest-cxf-showcase</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<body>
<h1>

    <h2>ProductService</h2>
    <ul>
        <li><a target="_blank" href="${ctxPath}/ws/ProductService">/ws/ProductService</a></li>
        <li><a target="_blank" href="${ctxPath}/ws/ProductService?wsdl">/ws/ProductService?wsdl</a></li>
    </ul>


</h1>
</body>
</html>