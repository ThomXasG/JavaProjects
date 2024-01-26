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
public class PagosDecorador extends CuentaDecorator{
    
    public PagosDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }
    
    @Override
    public ICuentaBancaria abrirCuenta() {
         this.cuentaDecorada= cuentaDecorada.abrirCuenta();
        agregarPagos();
        return cuentaDecorada;
    }
    
    public void agregarPagos(){
        double costoPagos = this.getCosto() + 0.50;
        this.cuentaDecorada.setCosto(costoPagos);
        System.out.println("Se agregó el servicio de Pagos. \nCon un costo"
                +" adicional de $0.5");
        System.out.println("Los costos de la cuenta ascienden a: $"  + costoPagos);
            
    }
}
