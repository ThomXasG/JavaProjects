/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.charge.factory.creator;

/**
 *
 * @author joelv
 */
public class AppFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Utilizando un Factory con creadores concretos
        FigureManagerFactory figureManager = new FigureManagerFactory(new CircleCreator());
        figureManager.createFigure();
        System.out.println(figureManager.getFigure().getNombre());
        System.out.println(figureManager.getFigure().area());
        System.out.println(figureManager.getFigure().numberOfSlides());
        
        System.out.println("*******************************************");
        
        figureManager = new FigureManagerFactory(new SquareCreator());
        figureManager.createFigure();
        System.out.println(figureManager.getFigure().getNombre());
        System.out.println(figureManager.getFigure().area());
        System.out.println(figureManager.getFigure().numberOfSlides());
        
        System.out.println("*******************************************");
        
        figureManager = new FigureManagerFactory(new RectangleCreator());
        figureManager.createFigure();
        System.out.println(figureManager.getFigure().getNombre());
        System.out.println(figureManager.getFigure().area());
        System.out.println(figureManager.getFigure().numberOfSlides());
        
    }
    
}
