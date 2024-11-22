<%@ page import="models.UserModel" %>
<%@ page import="entities.User" %><%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 17.11.2024
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UpdateUser</title>
</head>
<body>
<%int id = Integer.parseInt(request.getParameter("id"));
    UserModel userModel = UserModel.getInstance();
    User myUser = userModel.find(id);%>
<h2>Update user:</h2>
<form action="updateUser?id=<%= myUser.getId()%>" method="post">
    <label>Name:
        <input type="text" name="name" value="<%= myUser.getName()%>"><br />
    </label>

    <label>Age:
        <input type="number" name="age" value="<%= myUser.getAge()%>"><br />
    </label>
    <button type="submit">Save changes</button>
</form>

</body>
</html>