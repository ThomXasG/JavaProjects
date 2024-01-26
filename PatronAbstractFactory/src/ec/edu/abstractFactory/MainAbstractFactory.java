package ec.edu.abstractFactory;

import ec.edu.abstractFactory.concrete1.Concrete1Factory;
import ec.edu.abstractFactory.concrete2.Concrete2Factory;

/**
 *
 * @author joelv
 */
public class MainAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**************Fabrica Familia de Productos 1************");
        AbstractFactory.setAbstractFactory(new Concrete1Factory());
        AbstractFactory miFabrica1 = AbstractFactory.getAbstractFactory();
        System.out.println("Producto A: " + miFabrica1.getProductA().view());
        System.out.println("Producto B: " + miFabrica1.getProductB().view());
        System.out.println("**************Fabrica Familia de Productos 2************");
        AbstractFactory.setAbstractFactory(new Concrete2Factory());
        AbstractFactory miFabrica2 = AbstractFactory.getAbstractFactory();
        System.out.println("Producto A: " + miFabrica2.getProductA().view());
        System.out.println("Producto B: " + miFabrica2.getProductB().view());
    }
    
}
