/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import static java.rmi.Naming.list;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author Sap-lap
 */
public class ProductDBContext extends DBContext {

     public ArrayList<Product> getProducts(){

ArrayList<Product> products = new ArrayList<>();
  try {
            String sql = "select * from Product";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                Product p = new Product();
                p.setPID(rs.getInt("pid")); 
                p.setNameP(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setImport_Price(rs.getInt("Import_Price"));
                p.setSale_Price(rs.getInt("Sale_Price"));
                p.setDay_in(rs.getDate("Day_in"));
                p.setDay_Out(rs.getDate("Day_Out"));
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
return products;
}
     public Product getProduct(int id){
         ArrayList<Product> products = getProducts();
         for (Product product:products){
             if (product.getPID()==id){
                 return product;
             }
         }
         return null;
     }
}

