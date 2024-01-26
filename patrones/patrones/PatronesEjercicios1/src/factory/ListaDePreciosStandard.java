/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joelv
 */
public class ListaDePreciosStandard implements ListaDePrecios{
    private List<Producto> productos;

    // Constructor, getters y setters...
    
    public ListaDePreciosStandard() {
        this.productos = new ArrayList<>();
        // Inicializar la lista de productos estándar...
    }
    
    public ListaDePreciosStandard(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    @Override
    public ListaDePreciosStandard clone() throws CloneNotSupportedException {
        ListaDePreciosStandard copia = new ListaDePreciosStandard();
        // Clonar la lista de productos
        for (Producto producto : this.getProductos()) {
            copia.getProductos().add(producto.clone());
        }
        return copia;
    }

    @Override
    public void mostrar() {
        System.out.println("Lista de Precios Estándar:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println();
    }
}
