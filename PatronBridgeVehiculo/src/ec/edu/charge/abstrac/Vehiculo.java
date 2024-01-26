/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.abstrac;

import ec.edu.charge.vehiImp.IMotor;

/**
 *
 * @author joelv
 */
public abstract class Vehiculo {
    protected IMotor motor;
    
    public Vehiculo(IMotor motor) {
        this.motor = motor;
    }
    
    public void Acelerar(double cantidad) {
        motor.inyectarCombustible(cantidad);
    }
    
    public void Frenar() {
        System.out.println("Vehiculo frenando");
    }
    
    public abstract void MostrarCaracteristicas();
    
}
