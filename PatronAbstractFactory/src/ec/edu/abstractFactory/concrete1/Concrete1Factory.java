/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.abstractFactory.concrete1;

import ec.edu.abstractFactory.AbstractFactory;
import ec.edu.abstractFactory.IProductA;
import ec.edu.abstractFactory.IProductB;

/**
 *
 * @author joelv
 */
public class Concrete1Factory extends AbstractFactory{
    private IProductA productA;
    private IProductB productB;

    @Override
    public IProductA getProductA() {
        if (productA == null) {
            productA = new ProductA1();
        }
        
        return productA;
    }

    @Override
    public IProductB getProductB() {
        if (productB == null) {
            productB = new ProductB1();
        }
        
        return productB;
    }
}
