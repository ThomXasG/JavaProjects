package ec.edu.charge.template.bebidas;

import ec.edu.charge.template.abs.BebidaTemplate;

public class Te extends BebidaTemplate {
    @Override
    public void agregarIngredientes() {
        System.out.println("Preparando las hojas de té");
    }

    @Override
    public void agregarSuplementos() {
        System.out.println("Agregando limón");
    }
}
