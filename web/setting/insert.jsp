<%-- 
    Document   : insert
    Created on : Mar 18, 2022, 2:28:11 AM
    Author     : pc
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Debt"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ArrayList<Product> depts = (ArrayList<Product>)request.getAttribute("products");
        %>
    </head>
    <body>
        <form action="Insert" method="POST">
            ID: <input type="text" name="PID"/> <br/>
            Name: <input type="text" name="NameP"/> <br/>
            Quality: <input type="text" name="Quantity"/><br/>
            Import Price: <input type="text" name="Import_Price"/><br/>
            Sale Price: <input type="text" name="Sale_Price"/><br/>
            Ngay Nhap: <input type="date" name="Day_in" /> <br/>
            Han Xu Dung: <input type="date" name="Day_Out" /> <br/>
           
            </select>
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
