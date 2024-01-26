/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.charge.daofactory;

import ec.edu.charge.daofactory.dao.ProductoDAO;
import ec.edu.charge.daofactory.entity.Product;
import java.util.List;

/**
 *
 * @author joelv
 */
public class FactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoDAO productDAO = new ProductoDAO(DBType.MySQL);
        
        List<Product> products = productDAO.findAllProducts();
        System.out.println("Product size ---> " + products.size());
        
        for (Product product : products) {
            System.out.println(product);
        }
        
        Product productA = new Product(3L, "Borrador", 0.30);
        Product productB = new Product(4L, "Libro P1", 3.20);
        
        productDAO.saveProduct(productA);
        productDAO.saveProduct(productB);
        
        System.out.println("Lista actualizada de productos");
        
        products = productDAO.findAllProducts();
        System.out.println("Product size ---> " + products.size());
        
        for (Product product : products) {
            System.out.println(product);
        }
    }
    
}
