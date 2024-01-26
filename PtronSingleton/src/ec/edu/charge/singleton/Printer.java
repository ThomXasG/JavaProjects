/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.singleton;

/**
 *
 * @author joelv
 */
public class Printer {
    private static Printer instance;
    private int nrOfPages;
    
    private Printer() {
        
    }
    
    public static Printer getInstance() {
        return instance == null ? instance = new Printer(): instance;
    }
    
    public void Print(String text) {
        System.out.println(text + "\n"
                + "Pages printed today" + ++nrOfPages + "\n --------------------");
    }
}
