/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.decorator.decoradores;

import ec.edu.charge.decorator.mensaje.IMessage;
import ec.edu.charge.decorator.mensaje.MensajeTexto;
import java.io.ByteArrayOutputStream;
import javax.xml.bind.*;
import javax.xml.namespace.QName;
/**
 *
 * @author joelv
 */
public class XMLMensajeDecorator extends MensajeDecorador {

    public XMLMensajeDecorator(IMessage mensaje) {
        super(mensaje);
    }

    @Override
    public IMessage procesarMnesaje() {
        this.mensaje = mensaje.procesarMnesaje();
        this.mensaje = xmlMensaje();
        return mensaje;
    }

    private IMessage xmlMensaje() {
        try {
            JAXBContext jc = JAXBContext.newInstance(mensaje.getClass());
            JAXBElement<IMessage> je2 = new JAXBElement<IMessage>(
                    new QName(mensaje.getClass().getName()),
                    (Class<IMessage>) mensaje.getClass(), mensaje);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            marshaller.marshal(je2, output);
            return new MensajeTexto(new String(output.toByteArray()));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al convertir el XML");
        }
    }
}
