/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.factory.creator;

import ec.edu.charge.factory.Figure;
import ec.edu.charge.factory.Rectangle;

/**
 *
 * @author joelv
 */
public class RectangleCreator extends FigureCreator{

    @Override
    public Figure createFigure() {
        return new Rectangle("Rectangulo", 20, 8);
    }
    
}
