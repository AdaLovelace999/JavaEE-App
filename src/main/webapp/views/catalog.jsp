<%@ page import="java.util.List" %>
<%@ page import="entities.User" %>
<%--
  Created by IntelliJ IDEA.
  User: Jammy Hubby
  Date: 11.11.2024
  Time: 21:21
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

<h2>Products</h2>
<%
    List<String> products = (List<String>) request.getAttribute("products");

    if (products != null && !products.isEmpty()) {
        for (String s : products) {
            out.println("<li>" + s + "</li>");
        }
    }
%>
</body>
</html>
