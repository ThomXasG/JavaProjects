/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.factory;

/**
 *
 * @author joelv
 */
public class FigureManager {
    //Factory
    private Figure figure;
    private FigureType type;

    public FigureManager(FigureType type) {
        this.type = type;
    }

    public Figure getFigure() {
        return figure;
    }

    public FigureType getType() {
        return type;
    }
    
    public void createFigure() {
        //Method Factory
        if (this.type == FigureType.CIRCLE) {
            this.figure = new Circle("Circulo", 1);
        } else if (this.type == FigureType.SQUARE) {
            this.figure = new Square("Cuadrado", 3);
        } else if (this.type == FigureType.TRIANGLE) {
            this.figure = new Triangle("Tringulo", 3, 5);
        } else if (this.type == FigureType.RECTANGLE){
            this.figure = new Rectangle("Rectangulo", 20, 8);
        } else {
            assert false: "unexpected";
        }
    }
}
