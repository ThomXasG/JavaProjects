/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author joelv
 */
public class ListaDePreciosVIP implements ListaDePrecios{
    private ListaDePreciosMayoreo listaMayoreo;

    public ListaDePreciosVIP() {
        // Constructor vacío
    }

    public ListaDePreciosMayoreo getListaMayoreo() {
        return listaMayoreo;
    }

    public void setListaMayoreo(ListaDePreciosMayoreo listaMayoreo) {
        this.listaMayoreo = listaMayoreo;
    }

    @Override
    public ListaDePreciosVIP clone() throws CloneNotSupportedException {
        ListaDePreciosVIP copia = new ListaDePreciosVIP();
        // Clonar la lista de precios de mayoreo y aplicar descuento adicional del 10%
        copia.setListaMayoreo(this.getListaMayoreo().clone());
        copia.aplicarDescuentoAdicional(0.10);
        return copia;
    }

    void aplicarDescuentoAdicional(double porcentaje) {
        System.out.println("Aplicando descuento adicional del " + (porcentaje * 100) + "% para clientes VIP.");
        for (Producto producto : this.getListaMayoreo().getListaEstandar().getProductos()) {
            double precioActual = producto.getPrecio();
            producto.setPrecio(precioActual * (1 - porcentaje));
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Lista de Precios para Clientes VIP:");
        for (Producto producto : this.getListaMayoreo().getListaEstandar().getProductos()) {
            System.out.println(producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println();
    }
    
}
