<%@ page import="java.util.List" %>
<%@ page import="entities.User" %><%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 11.11.2024
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<jsp:include page="views/header.jsp"/>
<h1>Home page</h1>

<h2>Add product:</h2>
<form action="catalog" method="post">
    <label>Name:
        <input type="text" name="name"><br />
    </label>

    <label>Price:
        <input type="number" name="price"><br />
    </label>
    <button type="submit">Submit</button>
</form>

</body>
</html>
