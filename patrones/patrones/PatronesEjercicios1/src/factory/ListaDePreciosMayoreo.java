/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author joelv
 */
public class ListaDePreciosMayoreo implements ListaDePrecios{
    private ListaDePreciosStandard listaEstandar;

    public ListaDePreciosMayoreo() {
        // Constructor vacío
    }

    public ListaDePreciosStandard getListaEstandar() {
        return listaEstandar;
    }

    public void setListaEstandar(ListaDePreciosStandard listaEstandar) {
        this.listaEstandar = listaEstandar;
    }

    @Override
    public ListaDePreciosMayoreo clone() throws CloneNotSupportedException {
        ListaDePreciosMayoreo copia = new ListaDePreciosMayoreo();
        // Clonar la lista de precios estándar y aplicar descuento del 10%
        copia.setListaEstandar(this.getListaEstandar().clone());
        copia.aplicarDescuento(0.10);
        return copia;
    }

    void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento del " + (porcentaje * 100) + "% para clientes de mayoreo.");
        for (Producto producto : this.getListaEstandar().getProductos()) {
            double precioActual = producto.getPrecio();
            producto.setPrecio(precioActual * (1 - porcentaje));
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Lista de Precios para Clientes de Mayoreo:");
        for (Producto producto : this.getListaEstandar().getProductos()) {
            System.out.println(producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println();
    }
    
}
