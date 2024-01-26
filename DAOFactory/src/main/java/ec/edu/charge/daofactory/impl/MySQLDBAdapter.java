/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.daofactory.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joelv
 */
public class MySQLDBAdapter implements IDBAdapter{
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/pos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSSWORD = "admin";
    
    @Override
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return null;
        }
    }
    
}
