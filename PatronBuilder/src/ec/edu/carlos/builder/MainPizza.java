
package ec.edu.carlos.builder;

public class MainPizza {

    public static void main(String[] args) {
        CocinaDirector directorHawai= new CocinaDirector(new HawaiPizzaBuilder());
        
        directorHawai.construirPizza();
        Pizza pizza = directorHawai.getPizza();
        
        System.out.println("Pizza Hawaiana");
        System.out.println("===============");
        System.out.println(pizza.mostrarPizza());
        
        CocinaDirector directorPicante= new CocinaDirector(new PicantePizzaBuilder());
        
        directorHawai.construirPizza();
        Pizza pizza1 = directorPicante.getPizza();
        
        System.out.println("Pizza Hawaiana");
        System.out.println("===============");
        System.out.println(pizza1.mostrarPizza());
    }
    
}
