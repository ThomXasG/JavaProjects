/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.charge.builder;

/**
 *
 * @author joelv
 */
public interface IMotor {
    void setPotencia(int potencia);
    void setCilindraje(int cilindraje);
    String getDefinicionMotor();
    String inyectarCombustible(int cantidad);
}
