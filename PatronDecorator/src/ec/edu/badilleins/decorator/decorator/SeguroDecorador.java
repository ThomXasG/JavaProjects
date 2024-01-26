package ec.edu.badilleins.decorator.decorator;

import ec.edu.badilleins.decorator.inter.ICuentaBancaria;
import ec.edu.badilleins.decorator.model.Cuenta;

public class SeguroDecorador extends CuentaDecorator{
    public SeguroDecorador(ICuentaBancaria cuentaDecorada){
        super(cuentaDecorada);
    }
    
    public ICuentaBancaria abrirCuenta() {
        this.cuentaDecorada= cuentaDecorada.abrirCuenta();
        agregarSeguro();
        return cuentaDecorada;
    }
    
    public void agregarSeguro(){
        double costoSeguro = this.getCosto() + 30;
        this.cuentaDecorada.setCosto(costoSeguro);
        System.out.println("Se agregó un seguro a la cuenta. \nCon un costo adicional de $30");
        System.out.println("Los costos de la cuenta ascienden a: $"  + costoSeguro);
    }
}
