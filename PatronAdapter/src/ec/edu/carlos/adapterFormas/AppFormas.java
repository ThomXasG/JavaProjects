package ec.edu.carlos.adapterFormas;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author g4to1
 */
public class AppFormas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IForma linea = new Linea();
        IForma rombo = new Rombo();
        IForma texto = new CuadroTextoAdaptador();
        ArrayList<IForma> formas = new ArrayList<>();
        formas.add(linea);
        formas.add(rombo);
        formas.add(texto);
        for (IForma forma : formas) {
            forma.dibujar();
        }
    }
}
