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
public class Monovolumen extends Vehiculo {
    private boolean puertaCorrediza;

    public Monovolumen(boolean puertaCorrediza, IMotor motor) {
        super(motor);
        this.puertaCorrediza = puertaCorrediza;
    }
    
    @Override
    public void MostrarCaracteristicas() {
        System.out.println("Auto Monovolumen\n"
                + "Puerta Corrediza: " + puertaCorrediza);
    }
    
}
