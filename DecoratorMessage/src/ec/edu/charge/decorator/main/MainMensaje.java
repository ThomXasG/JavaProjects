/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.charge.decorator.main;

import ec.edu.charge.decorator.decoradores.*;
import ec.edu.charge.decorator.mensaje.*;

/**
 *
 * @author joelv
 */
public class MainMensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MensajeCliente mensajeCliente = new MensajeCliente(
                "Carlos Aguirre","carlos133@gmail.com","098865432");
        
        System.out.println("Mensaje Original ==> " + mensajeCliente);
        
        IMessage mensaje1 = new EncryptMensajeDecorator("usuario","HG58YZ3CR9123456", 
                new SOAPMensajeDecorator(
        new XMLMensajeDecorator(mensajeCliente))).procesarMnesaje();
        
        System.out.println("mensaje1 ============>\n"
        +mensaje1.getContenido());
        System.out.println("");
        
        IMessage mensaje2 = new SOAPMensajeDecorator(new EncryptMensajeDecorator("usuario1","HG58YZ3CR9123456",
                new XMLMensajeDecorator(mensajeCliente))).procesarMnesaje();
        
        System.out.println("mensaje2 ============>\n"
        +mensaje2.getContenido());
        
        IMessage mensaje3 = new XMLMensajeDecorator(mensajeCliente).procesarMnesaje();
         System.out.println("mensaje3 ============>\n"
        +mensaje3.getContenido());
    }
    
}
