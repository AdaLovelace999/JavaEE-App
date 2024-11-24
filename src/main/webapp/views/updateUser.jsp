<%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 17.11.2024
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>UpdateUser</title>
</head>
<body>
<a href="userMoreInfo?id=${requestScope.user.id}">Back</a>
<h2>Update user:</h2>

<form method="post">
    <input type="hidden" value="${requestScope.user.id}" name="id"/>
    <label>Name:
        <input type="text" name="name" value="${requestScope.user.name}"><br />
    </label>
    <label>Age:
        <input type="number" name="age" value="${requestScope.user.age}"><br />
    </label>
    <button type="submit">Save changes</button>
</form>

</body>
</html>
