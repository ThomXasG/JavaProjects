
package ec.edu.carlos.builder;

public class HawaiPizzaBuilder implements IPizzaBuilder{
    private Pizza pizza;

    public HawaiPizzaBuilder() {
        this.pizza=new Pizza();
    }
    
    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    @Override
    public void buildMasa() {
        this.pizza.setMasa("Suave");
    }

    @Override
    public void buildSalsa() {
        this.pizza.setSalsa("Dulce");
    }

    @Override
    public void buildRelleno() {
        this.pizza.setRelleno("Queso+Chorizo+Piña");
    }
    
}
