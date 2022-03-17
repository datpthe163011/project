/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
public class Product {

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String NameP) {
        this.NameP = NameP;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getImport_Price() {
        return Import_Price;
    }

    public void setImport_Price(int Import_Price) {
        this.Import_Price = Import_Price;
    }

    public int getSale_Price() {
        return Sale_Price;
    }

    public void setSale_Price(int Sale_Price) {
        this.Sale_Price = Sale_Price;
    }

    public Date getDay_in() {
        return Day_in;
    }

    public void setDay_in(Date Day_in) {
        this.Day_in = Day_in;
    }

    public Date getDay_Out() {
        return Day_Out;
    }

    public void setDay_Out(Date Day_Out) {
        this.Day_Out = Day_Out;
    }
    private int PID;
    private String NameP;
    private int Quantity;
    private int Import_Price;
    private int Sale_Price;
    private Date Day_in;
    private Date Day_Out;


    
}
