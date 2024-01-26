/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.badilleins.decorator.decorator;

import ec.edu.badilleins.decorator.inter.ICuentaBancaria;
import ec.edu.badilleins.decorator.model.Cuenta;

/**
 *
 * @author Personal
 */
public abstract class CuentaDecorator implements ICuentaBancaria{
    //Base Decorator
    protected ICuentaBancaria cuentaDecorada;
    public CuentaDecorator(ICuentaBancaria cuentaDecorada){
        this.cuentaDecorada=cuentaDecorada;
    }
//Se puede quitar de cada cuenta ahorros o corriente e implementarle aqui.
    @Override
    public double getCosto() {
        return cuentaDecorada.getCosto();
    }

    @Override
    public void setCosto(double costo) {
        cuentaDecorada.setCosto(costo);
     }
    
}
