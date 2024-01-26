/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.factory;

/**
 *
 * @author joelv
 */
public class Square extends Figure{
    private double side;

    public Square(String nombre, double side) {
        super(nombre);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double numberOfSlides() {
        return 4;
    }

    @Override
    public String toString() {
        return "Square{" + "side = " + side + '}';
    }
    
    
}
