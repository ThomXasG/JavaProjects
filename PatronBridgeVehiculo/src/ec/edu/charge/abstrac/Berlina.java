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
public class Berlina extends Vehiculo{
    private int capacidadMaletero;

    public Berlina(int capacidadMaletero, IMotor motor) {
        super(motor);
        this.capacidadMaletero = capacidadMaletero;
    }
    
    @Override
    public void MostrarCaracteristicas() {
        System.out.println("Auto: Berlina\n"
                + "Capacidad Maletero: " + capacidadMaletero + "lb");
    }
}
