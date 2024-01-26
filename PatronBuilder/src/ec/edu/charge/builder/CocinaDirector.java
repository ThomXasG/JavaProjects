/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.builder;

/**
 *
 * @author joelv
 */
public class CocinaDirector {
    private IPizzaBuilder builder;

    public CocinaDirector(IPizzaBuilder builder) {
        this.builder = builder;
    }
    
    public void construirPizza() {
        this.builder.buildMasa();
        this.builder.buildSalsa();
        this.builder.buildRelleno();
    }
    
    public Pizza getPizza() {
        return builder.getPizza();
    }
}
