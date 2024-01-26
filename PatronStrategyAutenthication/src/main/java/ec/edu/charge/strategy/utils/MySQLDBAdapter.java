package ec.edu.charge.strategy.utils;

import java.sql.*;

public class MySQLDBAdapter {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";


    public Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("Connection class ==> "
                    + connection.getClass().getName());
            return connection;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return null;
        }
    }


}