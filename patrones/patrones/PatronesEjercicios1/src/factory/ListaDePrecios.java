/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

/**
 *
 * @author joelv
 */
public interface ListaDePrecios extends Cloneable {
    ListaDePrecios clone() throws CloneNotSupportedException;
    void mostrar();
}
