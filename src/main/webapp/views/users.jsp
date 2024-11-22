<%@ page import="java.util.List" %>
<%@ page import="entities.User" %>
<%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 13.11.2024
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>${Title}</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<h1>${Header}</h1>

<h2>Users </h2>
<%
  List<User> users = (List<User>) request.getAttribute("users");

  if (users != null && !users.isEmpty()) {
    for (User u : users) {
      out.print("<li>" + u + "<a href=userMoreInfo?id="+ u.getId() +">" + "More" + "</a>" + "</li>" );
    }
  }
  else out.println("<p>There are no users yet!</p>");

%>
<button onclick="location.href='addUser'">Add</button>
</body>
</html>
