/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.decorator.decorator;

import ec.edu.charge.decorator.inter.ICuentaBancaria;
import ec.edu.charge.decorator.model.Cuenta;

/**
 *
 * @author joelv
 */
public abstract class CuentaDecorador implements ICuentaBancaria{
    protected ICuentaBancaria cuentaDecorada;
    
    public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
        this.cuentaDecorada = cuentaDecorada;
    }
    
    public void abrirCuenta() {
        this.cuentaDecorada.abrirCuenta();
    }
}
