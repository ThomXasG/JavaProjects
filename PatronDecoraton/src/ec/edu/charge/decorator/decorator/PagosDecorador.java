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
public class PagosDecorador extends CuentaDecorador {    

    public PagosDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }
    
    @Override
    public void abrirCuenta(Cuenta c) {
        cuentaDecorada.abrirCuenta(c);
        agregarPagos(c);
    }
    
    public void agregarPagos(Cuenta c) {
        double costoPagos = c.getCosto() + 0.50;
        System.out.println("Se agrego un servicio de pagos del cliente: " +
                c.getCliente() + "\nCon un costo sdiniconal de: $0.50");
        System.out.println("Los costos de la cuenta ascienden a: $" + costoPagos);
    }
}
