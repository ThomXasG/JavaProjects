/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.factory.creator;

import ec.edu.charge.factory.Figure;
import ec.edu.charge.factory.Triangle;

/**
 *
 * @author joelv
 */
public class TriangleCreator extends FigureCreator{

    @Override
    public Figure createFigure() {
        return new Triangle("Triangulo", 4, 6);
    }
    
}
