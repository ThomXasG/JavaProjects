/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.decorator.mensaje;

/**
 *
 * @author joelv
 */
public class MensajeCliente implements IMessage {
    private String nombre, email, telefono;

    public MensajeCliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    @Override
    public IMessage procesarMnesaje() {
        return this;
    }

    @Override
    public String getContenido() {
        return toString();
    }

    @Override
    public void setContenido(String contenido) {
        throw new UnsupportedOperationException("Aun no es compatible."); 
    }

    @Override
    public String toString() {
        return "MensajeCliente{" + "nombre=" + nombre + ", email=" + email + 
                ", telefono=" + telefono + '}';
    }
    
}
