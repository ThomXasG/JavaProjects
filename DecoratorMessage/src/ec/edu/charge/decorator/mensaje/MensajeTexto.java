/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.decorator.mensaje;

/**
 *
 * @author joelv
 */
public class MensajeTexto implements IMessage {
    private String contenido;

    public MensajeTexto(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public IMessage procesarMnesaje() {
        return this;
    }

    @Override
    public String getContenido() {
        return this.contenido;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}
