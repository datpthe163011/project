<%-- 
    Document   : update
    Created on : Feb 11, 2022, 2:51:05 PM
    Author     : SAP-LAP-FPT
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
            Product p = (Product) request.getAttribute("product");
            
        %>
        
    </head>
    <body>
        <form action="Update" method="POST">
            ID:<%=p.getPID() %> <input type="hidden" name="PID" value="<%=p.getPID() %>"/> <br/>
            Name: <input type="text" name="NameP" value="<%=p.getNameP()%>" /><br/>
            Quality: <input type="text" name="Quantity" value="<%=p.getQuantity()%>"/><br/>
            Import Price: <input type="text" name="Import_Price" value="<%=p.getImport_Price()%>"/><br/>
            Sale Price: <input type="text" name="Sale_Price" value="<%=p.getSale_Price()%>"/><br/>
            Ngay Nhap: <input type="date" name="Day_in" value="<%=p.getDay_in()%>" /> <br/>
            Han Xu Dung: <input type="date" name="Day_Out" value="<%=p.getDay_Out()%>" /> <br/>
           
            </select>
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
