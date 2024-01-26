/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.badilleins.decorator.model;

import ec.edu.badilleins.decorator.decorator.PagosDecorador;
import ec.edu.badilleins.decorator.decorator.SeguroDecorador;
import ec.edu.badilleins.decorator.impl.CuentaAhorro;
import ec.edu.badilleins.decorator.impl.CuentaCorriente;
import ec.edu.badilleins.decorator.inter.ICuentaBancaria;

/**
 *
 * @author Personal
 */
public class MainDecorador {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1,"Luis Salinas",25);
        cuentaAhorro.abrirCuenta();

        ICuentaBancaria cuentaAhorro1 = new PagosDecorador(cuentaAhorro);
        cuentaAhorro1.abrirCuenta();
        
        System.out.println("***********");
        CuentaCorriente cuentaCorriente = new CuentaCorriente(2, "Juan Perez", 30);
        ICuentaBancaria cuentaCorriente1 = new  PagosDecorador(new SeguroDecorador(cuentaCorriente));
        cuentaCorriente1.abrirCuenta(); 
    }
        
}
