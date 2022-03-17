<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : home
    Created on : Mar 14, 2022, 10:55:26 PM
    Author     : pc
<body>
        <h1>WELL COME TO SHOP</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Kho Hang</th>
                    <th><a href="Product.jsp">Detail</a></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Nhap Hang</td>
                    <td><a href="InputProduct">Detail</a></td>
                </tr>
                <tr>
                    <td>Ban Hang</td>
                    <td><a href="sell">Detail</a></td>
                </tr>
                <tr>
                    <td>Hoa don</td>
                    <td><a href="Bill">Detail</a></td>
                </tr>
                <tr>
                    <td>No</td>
                    <td><a href="debit">Detail</a></td>
                </tr>
            </tbody>
        </table>
    </body>
--%>

<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=order.getSize()+" "%> items in the shopping cart.
        <table border="1px">
            <tr>
                <td>Product</td>
                <td>Price</td>
                <td></td>
            </tr>
            <% for (Product p : products) {
            %>
            <tr>
                <td><%=p.getName()%></td>
                <td><%=p.getPrice()%></td>
                <td>
                    <form action="addcart" method="POST"> 
                        <input type="hidden" value="<%=p.getId()%>" name="id"/>
                        <input type="submit" value="Buy"/>
                    </form>
                </td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
