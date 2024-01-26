package ec.edu.carlos.adapterFormas;

public class Rombo implements IForma{

    @Override
    public void dibujar() {
        System.out.println("    *   ");
        System.out.println("   ***  ");
        System.out.println("  ***** ");
        System.out.println(" ******* ");
        System.out.println("  ***** ");
        System.out.println("   ***  ");
        System.out.println("    *   ");
    }
    
}
