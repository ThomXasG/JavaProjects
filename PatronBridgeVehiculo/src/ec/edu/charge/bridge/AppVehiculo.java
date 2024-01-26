/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.bridge;

import ec.edu.charge.abstrac.Berlina;
import ec.edu.charge.abstrac.Vehiculo;
import ec.edu.charge.vehiImp.Diesel;
import ec.edu.charge.vehiImp.IMotor;

/**
 *
 * @author joelv
 */
public class AppVehiculo {
    public static void main(String[] args) {
        IMotor motorDiesel = new Diesel();
        Vehiculo berlina = new Berlina(4, motorDiesel);

        berlina.MostrarCaracteristicas();
        berlina.Acelerar(2.4d);
    }
}
