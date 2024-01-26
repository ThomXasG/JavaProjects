/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Asus
 */
public class FacturaIvaReducido extends Factura {

    public FacturaIvaReducido(int id, double importe) {
        super(id, importe);
    }

    @Override
    public Factura clonar() {
        FacturaIvaReducido factura = null;
        try {
            factura = (FacturaIvaReducido) clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return factura;    }

    @Override
    public double importeTotal() {
        return this.getImporte()*1.07;
    }

}
