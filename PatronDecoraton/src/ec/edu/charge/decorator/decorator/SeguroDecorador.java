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
public class SeguroDecorador extends CuentaDecorador {
    public SeguroDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }
    
    @Override
    public void abrirCuenta() {
        agregarSeguro();
    }
    
    public void agregarSeguro() {
        double costoSeguro = cuentaDecorada.getCosto() + 30;
        System.out.println("Se agrego un seguro a la cuenta del cliente: " +
                c.getCliente() + " con un costo de: $30");
        System.out.println("Los costos de la cuenta ascienden a: $" + costoSeguro);
    }
}
