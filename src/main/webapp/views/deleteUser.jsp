<%@ page import="entities.User" %>
<%@ page import="models.UserModel" %><%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 15.11.2024
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>DeleteUser</title>
  </head>
  <body>
  <%int id = Integer.parseInt(request.getParameter("id"));
    UserModel userModel = UserModel.getInstance();
    User myUser = userModel.find(id);
    userModel.delete(myUser);
  %>
  <p>User with ID= <%=myUser.getId()%> is deleted!</p>
  <button><a href="users">Ok</a></button>
  </body>
</html>
