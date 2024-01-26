/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.factory.creator;

import ec.edu.charge.factory.Figure;

/**
 *
 * @author joelv
 */
public class FigureManagerFactory {
    public Figure figure;
    private FigureCreator creador;

    public void setCreador(FigureCreator creador) {
        this.creador = creador;
    }

    public FigureManagerFactory(FigureCreator creador) {
        this.creador = creador;
    }
    
    public void createFigure() {
        this.figure = this.creador.createFigure();
    }
    
    public Figure getFigure() {
        return this.figure;
    }
}
 