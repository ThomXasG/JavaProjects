package ec.edu.charge.factory.creator;

import ec.edu.charge.factory.Circle;
import ec.edu.charge.factory.Figure;

public class CircleCreator extends FigureCreator{

    @Override
    public Figure createFigure() {
        return new Circle("Circulo", 2);
    }
    
}
