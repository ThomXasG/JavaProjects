/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.abstractFactory;

/**
 *
 * @author joelv
 */
public abstract class AbstractFactory {
    private static AbstractFactory abstractFactory;
    
    public static void setAbstractFactory(AbstractFactory abstractFactory) {
        AbstractFactory.abstractFactory = abstractFactory;
    }
    
    public static AbstractFactory getAbstractFactory() {
        return abstractFactory;
    }
    
    public abstract IProductA getProductA();
    public abstract IProductB getProductB();
}