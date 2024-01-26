/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.daofactory.impl;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author joelv
 */
public class PostgreDBAdapter implements IDBAdapter{
private final String JDBC_DRIVER = "org.postgresql.Driver";//com.mysql.jdbc.Diver
    private final String DB_URL = "jdbc:postgresql://localhost:5432/test"; 
    private final String USER = "postgres";
    private final String PASS = "admin";

    @Override
     public Connection getConnection(){
        try {
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, USER, PASS);
             
        } catch (Exception ex) {
             ex.printStackTrace(System.out);
            return null;
        }
    }
    
}
