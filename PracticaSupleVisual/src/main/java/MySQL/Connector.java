/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQL;

import java.sql.*;

/**
 *
 * @author joelv
 */
public class Connector {
    Connection con = null;
    
    public Connection connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "practicavisual", "root", "");
            System.out.println("Se conecto");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return con;
    }
}
