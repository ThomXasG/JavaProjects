/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.builder;

/**
 *
 * @author joelv
 */
public class HawaiPizzaBuilder implements IPizzaBuilder{
    private Pizza pizza;

    public HawaiPizzaBuilder() {
        this.pizza = new Pizza();
    }
    
    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    @Override
    public void buildMasa() {
        this.pizza.setMasa("suave");
    }

    @Override
    public void buildSalsa() {
        this.pizza.setSalsa("dulce");
    }

    @Override
    public void buildRelleno() {
        this.pizza.setRelleno("piña");
    }
    
}
