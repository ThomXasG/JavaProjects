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
public class SOAPMensajeDecorator extends MensajeDecorador {
    
    public SOAPMensajeDecorator(IMessage mensaje) {
        super(mensaje);
    }

    @Override
    public IMessage procesarMnesaje() {
        mensaje.procesarMnesaje();
        this.mensaje = envelopMensaje();
        return mensaje;
    }
    
    public IMessage envelopMensaje() {
        String soap = "<soapenv:Envelope xmlns:soapenv="
                + "\"http://schemas.xmlsoap.org/soap/envelope/\" "
                + "xmlns:ser=\"http://service.dishweb.cl.com/\">\n"
                + " <soapenv:Header/>\n"
                + " <soapenv:Body>\n"
                + mensaje.getContenido()
                + "\n"
                + " </soapenv:Body>\n"
                + "</soapenv:Envelope>";
        mensaje.setContenido(soap);
        return mensaje;
    }
}
