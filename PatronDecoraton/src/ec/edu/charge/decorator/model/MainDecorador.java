/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.charge.decorator.model;

import ec.edu.charge.decorator.decorator.PagosDecorador;
import ec.edu.charge.decorator.decorator.SeguroDecorador;
import ec.edu.charge.decorator.impl.CuentaAhorro;
import ec.edu.charge.decorator.inter.ICuentaBancaria;

/**
 *
 * @author joelv
 */
public class MainDecorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta = new Cuenta(1, "Thomas Vaca", 25);
        ICuentaBancaria cuentaAhorro = new CuentaAhorro();
        cuentaAhorro.abrirCuenta(cuenta);
        
        cuentaAhorro = new SeguroDecorador(cuentaAhorro);
        cuentaAhorro.abrirCuenta(cuenta);
        
        cuentaAhorro = new PagosDecorador(cuentaAhorro);
        cuentaAhorro.abrirCuenta(cuenta);
    }
    
}
