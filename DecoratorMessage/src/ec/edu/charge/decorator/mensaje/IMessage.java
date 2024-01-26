/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.charge.decorator.mensaje;

/**
 *
 * @author joelv
 */
public interface IMessage {
    public IMessage procesarMnesaje();
    public String getContenido();
    public void setContenido(String contenido);
}
