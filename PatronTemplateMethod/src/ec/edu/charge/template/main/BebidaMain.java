package ec.edu.charge.template.main;

import ec.edu.charge.template.bebidas.Cafe;
import ec.edu.charge.template.bebidas.Te;

public class BebidaMain {
    public static void main(String[] args) {
        System.out.println("Preparando café");
        Cafe cafe = new Cafe();
        cafe.prepararBebida();

        System.out.println("--------------------------------\n");

        System.out.println("Preparando té");
        Te te = new Te();
        te.prepararBebida();
    }
}
