/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.factory;

/**
 *
 * @author joelv
 */
public class Circle extends Figure{
    private double radius;

    public Circle(String nombre, double radius) {
        super(nombre);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double numberOfSlides() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius = " + radius + '}';
    }
    
    
}
