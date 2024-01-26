/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Asus
 */
public class FactoryMain {

    public static void main(String[] args) {
        FacturaFactory factory = new FacturaFactory(FacturaType.IVA);
        Factura facturaIVA = factory.crearFacturas(1, 100.0);
        factory = new FacturaFactory(FacturaType.IVAREDUCIDO);
        Factura facturaIVAReducido = factory.crearFacturas(2, 100.0);

        FacturaPrototype registry = new FacturaPrototype();
        registry.registrarPrototipo(FacturaType.IVA, facturaIVA);
        registry.registrarPrototipo(FacturaType.IVAREDUCIDO, facturaIVAReducido);

        Factura facturaClonadaIVA = registry.obtenerPrototipo(FacturaType.IVA);
        Factura facturaClonadaIVAReducido = registry.obtenerPrototipo(FacturaType.IVAREDUCIDO);

        System.out.println("Facturas originales:");
        System.out.println("Factura IVA - ID: " + facturaIVA.getId() + ", Importe: " + facturaIVA.getImporte() + ", Importe con IVA: " + facturaIVA.importeTotal());
        System.out.println("Factura IVAReducido - ID: " + facturaIVAReducido.getId() + ", Importe: " + facturaIVAReducido.getImporte() + ", Importe con IVA: " + facturaIVAReducido.importeTotal());

        System.out.println("Facturas clonadas:");
        System.out.println("Factura IVA Clonada - ID: " + facturaClonadaIVA.getId() + ", Importe: " + facturaClonadaIVA.getImporte() + ", Importe con IVA: " + facturaClonadaIVA.importeTotal());
        System.out.println("Factura IVAReducido Clonada - ID: " + facturaClonadaIVAReducido.getId() + ", Importe: " + facturaClonadaIVAReducido.getImporte() + ", Importe con IVA: " + facturaClonadaIVAReducido.importeTotal());
    }
}
