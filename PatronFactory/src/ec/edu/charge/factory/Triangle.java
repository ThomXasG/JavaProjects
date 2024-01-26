/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.factory;

/**
 *
 * @author joelv
 */
public class Triangle extends Figure{
    private double base;
    private double height;

    public Triangle(String nombre, double base, double height) {
        super(nombre);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double numberOfSlides() {
        return 3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base = " + base + ", height = " + height + '}';
    }
    
    
}
