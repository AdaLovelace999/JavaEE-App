<%@ page import="entities.User" %>
<%@ page import="models.UserModel" %>
<%@ page import="servlets.UsersServlet" %><%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 14.11.2024
  Time: 1:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserMoreInfo</title>
</head>
<body>
<a href="users">Back</a>
<h1>UserMoreInfo</h1>
<p>User id: <%= request.getParameter("id")%></p>

<%int id = Integer.parseInt(request.getParameter("id"));
    UserModel userModel = UserModel.getInstance();
    User myUser = userModel.find(id);
    out.println("<p>" + "User name: " + myUser.getName() +"</p>");
    out.println("<p>" + "User age: " + myUser.getAge() +"</p>");
%>
<button><a href="deleteUser?id=<%= myUser.getId()%>">Delete</a></button>
<button><a href="updateUser?id=<%=myUser.getId()%>">Update</a></button>
</body>
</html>
