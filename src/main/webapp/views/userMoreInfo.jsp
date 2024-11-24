<%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 14.11.2024
  Time: 1:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>UserMoreInfo</title>
</head>
<body>
<a href="users">Back</a>

<h1>UserMoreInfo</h1>

<p>User id: ${requestScope.user.id}</p>
<p>User name: ${requestScope.user.name}</p>
<p>User age: ${requestScope.user.age}</p>

<button><a href="deleteUser?id=${requestScope.user.id}">Delete</a></button>
<button><a href="updateUser?id=${requestScope.user.id}">Update</a></button>
</body>
</html>
