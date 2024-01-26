/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.daofactory.entity;

/**
 *
 * @author joelv
 */
public class Product {
    private Long idProducto;
    private String productName;
    private double productPrice;

    public Product(Long idProducto, String productName, double productPrice) {
        this.idProducto = idProducto;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "idProducto = " + idProducto + ", productName = " + productName + ", productPrice = " + productPrice + '}';
    }
    
}
