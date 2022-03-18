<%-- 
    Document   : update
    Created on : Mar 18, 2022, 5:02:01 AM
    Author     : pc
--%>

<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products");
            Product s = (Product)request.getAttribute("Product");
        %>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
