package ec.edu.charge.template.abs;

public abstract class BebidaTemplate {
        public final void prepararBebida() {
            calentarAgua();
            agregarIngredientes();
            agregarSuplementos();
            servirEnVaso();
        }

        public void calentarAgua() {
            System.out.println("Calentando agua");
        }

        public abstract void agregarIngredientes();

        public void servirEnVaso() {
            System.out.println("Sirviendo en vaso");
        }

        public abstract void agregarSuplementos();
}
