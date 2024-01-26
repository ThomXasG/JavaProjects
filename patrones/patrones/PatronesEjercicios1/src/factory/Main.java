/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

/**
 *
 * @author joelv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // Crear lista de precios estándar
        ListaDePreciosStandard listaEstandar = new ListaDePreciosStandard();
        listaEstandar.getProductos().add(new Producto("Producto A", 100.0));
        listaEstandar.getProductos().add(new Producto("Producto B", 150.0));

        // Crear lista de precios para clientes de mayoreo
        ListaDePreciosMayoreo listaMayoreo = new ListaDePreciosMayoreo();
        listaMayoreo.setListaEstandar(listaEstandar.clone());  // Usar clon para evitar modificar la lista estándar original

        // Crear lista de precios para clientes VIP
        ListaDePreciosVIP listaVIP = new ListaDePreciosVIP();
        listaVIP.setListaMayoreo(listaMayoreo.clone());  // Usar clon para evitar modificar la lista de mayoreo original

        // Mostrar listas de precios antes de aplicar descuentos
        System.out.println("Antes de aplicar descuentos:");
        listaEstandar.mostrar();
        listaMayoreo.mostrar();
        listaVIP.mostrar();

        // Aplicar descuentos
        listaMayoreo.aplicarDescuento(0.10);
        listaVIP.aplicarDescuentoAdicional(0.10);

        // Mostrar listas de precios después de aplicar descuentos
        System.out.println("Después de aplicar descuentos:");
        listaEstandar.mostrar();
        listaMayoreo.mostrar();
        listaVIP.mostrar();
    }

}
