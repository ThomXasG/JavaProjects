/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class FacturaIVA extends Factura {

    public FacturaIVA(int id, double importe) {
        super(id, importe);
    }

    @Override
    public Factura clonar() {
        FacturaIVA factura = null;
        try {
            factura = (FacturaIVA) clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return factura;
    }

    @Override
    public double importeTotal() {
        return this.getImporte() * 1.12;
    }


    
}
