/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class FacturaPrototype {

    private Map<FacturaType, Factura> prototypes = new HashMap<>();

    public void registrarPrototipo(FacturaType tipo, Factura factura) {
        prototypes.put(tipo, factura);
    }

    public Factura obtenerPrototipo(FacturaType tipo) {
        Factura prototipo = prototypes.get(tipo);
        if (prototipo != null) {
            return (Factura) prototipo.clonar();
        }
        return null;
    }
}
