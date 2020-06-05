<%--
  Created by IntelliJ IDEA.
  User: voire
  Date: 5.6.20
  Time: 2:00 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
    <h2>Login Form</h2>

    <form method="post" action="LoginController">
      Username: <input type="text" name="username"><br>
      Password: <input type="pasword" name="password"><br>
      <input type="submit" value="login">
    </form>
  <h2><c:out value="${param.msg}"/></h2>
  </body>
</html>
