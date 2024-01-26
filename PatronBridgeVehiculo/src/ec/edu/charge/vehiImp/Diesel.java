/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.vehiImp;

/**
 *
 * @author joelv
 */
public class Diesel implements IMotor {

    @Override
    public void consumirCombustible() {
        realizarExplosion();
    }

    @Override
    public void inyectarCombustible(double cantidad) {
        System.out.println("Se inyecto " + cantidad + "ml de Diesel");
        consumirCombustible();
    }
    
    private void realizarExplosion() {
        System.out.println("Se realizo la explosion de Diesel");
    }
}
