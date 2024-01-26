package ec.edu.charge.template.bebidas;

import ec.edu.charge.template.abs.BebidaTemplate;

public class Cafe extends BebidaTemplate {
    @Override
    public void agregarIngredientes() {
        System.out.println("Pasando el cafe");
    }

    @Override
    public void agregarSuplementos() {
        System.out.println("Agregando azucar y leche");
    }
}
