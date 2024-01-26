/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.builder;

/**
 *
 * @author joelv
 */
public class PicantePizzaBuilder implements IPizzaBuilder{
    private Pizza pizza;

    public PicantePizzaBuilder() {
        this.pizza = new Pizza();
    }
    
    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    @Override
    public void buildMasa() {
        this.pizza.setMasa("cocida");
    }

    @Override
    public void buildSalsa() {
        this.pizza.setSalsa("picante");
    }

    @Override
    public void buildRelleno() {
        this.pizza.setRelleno("Queso + Pimienta + Salchicha");
    }
    
}
