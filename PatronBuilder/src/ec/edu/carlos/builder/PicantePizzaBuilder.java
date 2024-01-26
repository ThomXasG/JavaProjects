
package ec.edu.carlos.builder;

public class PicantePizzaBuilder implements IPizzaBuilder{
    private Pizza pizza;

    public PicantePizzaBuilder() {
        this.pizza=new Pizza();
    }
    
    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    @Override
    public void buildMasa() {
        this.pizza.setMasa("Cocida");
    }

    @Override
    public void buildSalsa() {
        this.pizza.setSalsa("Picante");
    }

    @Override
    public void buildRelleno() {
        this.pizza.setRelleno("Queso+Pimienta+Salchicha");
    }
}
