<%-- 
    Document   : Product
    Created on : Mar 17, 2022, 9:13:06 AM
    Author     : pc
--%>

<%@page import="javax.persistence.criteria.Order"%>
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
        %>
    </head>
    <body>
        <h1>Well Come!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Quantity</th>
                    <th>Import Price</th>
                    <th>Sale Price</th>
                    <th>Day In</th>
                    <th>Day Out</th>
                </tr>
            </thead>
            <tbody>
                <% for (Product p : products) {
            %>
            <tr>
                <td><%=p.getPID()%></td>
                <td><%=p.getNameP()%></td>
                <td><%=p.getQuantity()%></td>
                <td><%=p.getImport_Price()%></td>
                <td><%=p.getSale_Price()%></td>
                <td><%=p.getDay_in()%></td>
                <td><%=p.getDay_Out()%></td>
                
                
                
            </tr>
            <%}%>
                           </tbody>
        </table>

    </body>
</html>
