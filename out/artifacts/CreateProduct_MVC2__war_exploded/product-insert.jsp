<%--
  Created by IntelliJ IDEA.
  User: voire
  Date: 5.6.20
  Time: 3:57 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Insert Product</title>
    <c:if test="${sessionScope.bean.username == null}">
        <c:redirect url="index.jsp"/>
    </c:if>
</head>
<body>

<jsp:useBean id="bean" class="com.example.model.LoginBean" scope="session"/>

<h2>Hello, ${bean.username}</h2>


<h3>Insert new product</h3>
<form method="post" action="ProductController">
    Name: <input name="name" type="text"><br>
    Description: <input type="text" name="description"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
