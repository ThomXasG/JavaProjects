/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.daofactory.dao;

import ec.edu.charge.daofactory.DBFactory;
import ec.edu.charge.daofactory.DBType;
import ec.edu.charge.daofactory.entity.Product;
import ec.edu.charge.daofactory.impl.IDBAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joelv
 */
public class ProductoDAO {
    private DBFactory dbFactory = new DBFactory();
    private IDBAdapter dbAdapter;
    
    public ProductoDAO(DBType tyoe) {
        dbFactory.createDBAdapter(tyoe);
        this.dbAdapter = dbFactory.getDBAdapter();
    }
    
    public List<Product> findAllProducts() {
        Connection connection = dbAdapter.getConnection();
        List<Product> productList = new ArrayList<>();
        
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM productos");
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                productList.add(new Product(result.getLong(1),
                result.getString(2), 
                        result.getDouble(3)));
            }
            
            return productList;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    public boolean saveProduct (Product product) {
        Connection connection = dbAdapter.getConnection();
        
        try {
            PreparedStatement statement = connection
                    .prepareStatement("INSERT INTO productos(idProductos, "
                            + "productName, productPrice) VALUES (?,?,?)");
            statement.setLong(1, product.getIdProducto());
            statement.setString(2, product.getProductName());
            statement.setDouble(3, product.getProductPrice());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return true;
    }
}
