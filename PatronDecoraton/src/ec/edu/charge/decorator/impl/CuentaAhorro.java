/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.decorator.impl;

import ec.edu.charge.decorator.model.Cuenta;

/**
 *
 * @author joelv
 */
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(int id, String cliente, double costo) {
        super(id, cliente, costo);
    }

    public void abrirCuenta() {
        System.out.println("*****************************");
        System.out.println("Se abrio una cuenta de ahorro");
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Costo de apertura: " + this.getCosto());
    }
    
}
