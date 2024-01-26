/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.decorator.decoradores;

import ec.edu.charge.decorator.mensaje.IMessage;
import java.security.Key;
import java.util.Base64;
import java.util.Base64.Encoder;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author joelv
 */
public class EncryptMensajeDecorator extends MensajeDecorador {
    private String usuario;
    private String clave;

    public EncryptMensajeDecorator(String usuario, String clave, IMessage mensaje) {
        super(mensaje);
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public IMessage procesarMnesaje() {
        this.mensaje = mensaje.procesarMnesaje();
        this.mensaje = encryptMensaje();
        return mensaje;
    }
    
    private IMessage encryptMensaje() {
        try {
            Key key = new SecretKeySpec(clave.getBytes(), "AES");
            Cipher c = Cipher.getInstance("AES");
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encVal = c.doFinal(mensaje.getContenido().getBytes());
            Encoder encoder = Base64.getEncoder();
            //String encode = encoder.encodeToString(data);
            String encryptedValue = encoder.encodeToString(encVal);
            //String encryptedValue = new BASE64Encoder().encode(encVal);
            mensaje.setContenido(encryptedValue);
            return mensaje;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
