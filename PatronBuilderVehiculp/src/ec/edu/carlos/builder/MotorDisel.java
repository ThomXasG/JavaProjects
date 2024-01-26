/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.carlos.builder;

/**
 *
 * @author g4to1
 */
public class MotorDisel implements IMotor{
    int cilindraje=0;
    int potencia=0;

    @Override
    public void setPotencia(int potencia) {
        this.potencia=potencia;
    }

    @Override
    public void setCilindraje(int cilindraje) {
        this.cilindraje=cilindraje;
    }

    @Override
    public String getDefinicionMotor() {
        return "Cilindraje: " + this.cilindraje
                + "---------"+" Potencia: "+this.potencia;
    }

    @Override
    public String inyectarCombustible(int cantidad) {
        return String.format("Motor Disel: Inyecta %d ml",cantidad);
    }

    @Override
    public String consumirCombustible() {
        return "Motor Disel: Realiza combustion de Gasoil";
    }
}
