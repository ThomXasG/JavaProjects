/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.charge.builder;

/**
 *
 * @author joelv
 */
public class MainPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CocinaDirector directorHawaii = new CocinaDirector(new HawaiPizzaBuilder());
        directorHawaii.construirPizza();
        Pizza pizza = directorHawaii.getPizza();
        
        System.out.println("Pizza Hawaiana");
        System.out.println(pizza.mostrarPizza());
        
        System.out.println("===============================");
        
        CocinaDirector directorPicante = new CocinaDirector(new PicantePizzaBuilder());
        directorPicante.construirPizza();
        Pizza pizza1 = directorPicante.getPizza();
        
        System.out.println("Pizza Picante");
        System.out.println(pizza1.mostrarPizza());
    }
    
}
