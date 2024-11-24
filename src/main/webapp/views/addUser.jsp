<%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 14.11.2024
  Time: 0:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${Title}</title>
</head>
<body>
<h1>${Header}</h1>

<h2>Add user:</h2>
<form action="addUser" method="post">
    <label>Name:
        <input type="text" name="name"><br />
    </label>

    <label>Age:
        <input type="number" name="age"><br />
    </label>
    <button type="submit">Add</button>
</form>

</body>
</html>
