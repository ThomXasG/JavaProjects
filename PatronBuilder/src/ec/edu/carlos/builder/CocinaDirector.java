
package ec.edu.carlos.builder;

public class CocinaDirector {
    private IPizzaBuilder builder;

    public CocinaDirector(IPizzaBuilder builder) {
        this.builder = builder;
    }
    
    public void construirPizza(){
        this.builder.buildMasa();
        this.builder.buildSalsa();
        this.builder.buildRelleno();
    }
    
    public Pizza getPizza(){
        return builder.getPizza();
    }
}
