/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.decorator.decoradores;

import ec.edu.charge.decorator.mensaje.IMessage;

/**
 *
 * @author joelv
 */
public abstract class MensajeDecorador implements IMessage{
    // Base Decorator
    protected IMessage mensaje;

    public MensajeDecorador(IMessage mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public IMessage procesarMnesaje() {
        return this;
    }

    @Override
    public String getContenido() {
        return mensaje.getContenido();
    }

    @Override
    public void setContenido(String contenido) {
        this.mensaje.setContenido(contenido);
    }
}
