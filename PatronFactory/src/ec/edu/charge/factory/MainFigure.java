/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.charge.factory;

/**
 *
 * @author joelv
 */
public class MainFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FigureManager figureManager = new FigureManager(FigureType.DIAMOND);
        figureManager.createFigure();
        System.out.println(figureManager.getFigure().getNombre());
        System.out.println(figureManager.getFigure().area());
        System.out.println(figureManager.getFigure().numberOfSlides());
        
    }
    
}
