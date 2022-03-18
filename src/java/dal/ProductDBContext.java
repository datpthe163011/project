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

    public ArrayList<Product> getProducts() {

        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "select * from Product";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setPID(rs.getInt("PID"));
                p.setNameP(rs.getString("NameP"));
                p.setQuantity(rs.getInt("Quantity"));
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

    public Product getProduct(int id) {
        ArrayList<Product> products = getProducts();
        for (Product product : products) {
            if (product.getPID() == id) {
                return product;
            }
        }
        return null;
    }

    public void insertProduct(Product p) {
        String sql = "INSERT INTO [dbo].[Product]\n"
                + "           ([PID]\n"
                + "           ,[NameP]\n"
                + "           ,[Quantity]\n"
                + "           ,[Import_Price]\n"
                + "           ,[Sale_Price]\n"
                + "           ,[Day_in]\n"
                + "           ,[Day_Out])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, p.getPID());
            stm.setString(2, p.getNameP());
            stm.setInt(3, p.getQuantity());
            stm.setInt(4, p.getImport_Price());
            stm.setInt(5, p.getSale_Price());
            stm.setDate(6, p.getDay_in());
            stm.setDate(7, p.getDay_Out());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void updateProduct(Product p) {
        String sql = "UPDATE [dbo].[Product]\n"
                + "   SET [PID] = ?\n"
                + "      ,[NameP] = ?\n"
                + "      ,[Quantity] = ?\n"
                + "      ,[Import_Price] = ?\n"
                + "      ,[Sale_Price] = ?\n"
                + "      ,[Day_in] = ?\n"
                + "      ,[Day_Out] = ?\n"
                + " WHERE [PID] =?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, p.getPID());
            stm.setString(2, p.getNameP());
            stm.setInt(3, p.getQuantity());
            stm.setInt(4, p.getImport_Price());
            stm.setInt(5, p.getSale_Price());
            stm.setDate(6, p.getDay_in());
            stm.setDate(7, p.getDay_Out());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void deleteProduct(Product p) {
        String sql = "DELETE Student\n"
                + " WHERE [sid] = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, p.getPID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
