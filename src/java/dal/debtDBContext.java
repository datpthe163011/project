/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Debt;

/**
 *
 * @author pc
 */
public class debtDBContext extends DBContext{
     public ArrayList<Debt> getDebs()
    {
        ArrayList<Debt> debts = new ArrayList<>();
        try {
            String sql = "SELECT dID,dname FROM debt";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                Debt d = new Debt();
                d.setpID(rs.getInt("dID"));
                d.setDname(rs.getString("dname"));
                debts.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(debtDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return debts;
    }
}
