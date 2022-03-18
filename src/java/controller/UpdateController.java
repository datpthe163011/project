/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;

/**
 *
 * @author pc
 */
public class UpdateController extends HttpServlet {

   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        
        ProductDBContext db = new ProductDBContext();
        ArrayList<Product> products = db.getProducts();
       
        request.setAttribute("product", products);
        
        request.getRequestDispatcher("../setting/update.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_PID = request.getParameter("PID");
        String raw_NameP = request.getParameter("NameP");
        String raw_Quantity = request.getParameter("Quantity");
        String raw_Import_Price = request.getParameter("Import_Price");       
        String raw_Sale_Price = request.getParameter("Sale_Price");     
        String raw_Day_in = request.getParameter("Day_in");
        String raw_Day_Out = request.getParameter("Day_Out");
  
         //validate data
        int id = Integer.parseInt(raw_PID);      
        String name = raw_NameP;
        int Quantity = Integer.parseInt(raw_Quantity);
        int Import_Price = Integer.parseInt(raw_Import_Price);
        int Sale_Price = Integer.parseInt(raw_Sale_Price);
        Date Day_in = Date.valueOf(raw_Day_in);
        Date Day_Out = Date.valueOf(raw_Day_Out);
        
        
        Product p = new Product();
        p.setPID(id);
        p.setNameP(name);
        p.setQuantity(Quantity);
        p.setImport_Price(Import_Price);
        p.setSale_Price(Sale_Price);
        p.setDay_in(Day_in);
        p.setDay_Out(Day_Out);
        
        
        ProductDBContext db = new ProductDBContext();
        db.insertProduct(p);
        
        //response.getWriter().println("done");
        response.sendRedirect("list");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
