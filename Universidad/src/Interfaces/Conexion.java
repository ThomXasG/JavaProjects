/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author joelv
 */
public class Conexion {
    Connection con = null;
    
    public Connection Conectar() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/universidad", "root", "");
            //JOptionPane.showMessageDialog(null, "Conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return con;
    }
}
