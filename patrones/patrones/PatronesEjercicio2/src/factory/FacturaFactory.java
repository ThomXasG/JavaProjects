/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Asus
 */
public class FacturaFactory {

    private FacturaType tipo;

    public FacturaFactory(FacturaType tipo) {
        this.tipo = tipo;
    }

    public Factura crearFacturas(int id, double importe) {
        if (tipo == FacturaType.IVA) {
            return new FacturaIVA(id, importe);
        } else if (tipo == FacturaType.IVAREDUCIDO) {
            return new FacturaIvaReducido(id, importe);
        }
        return null;
    }

}
