package ec.edu.badilleins.decorator.inter;

import ec.edu.badilleins.decorator.model.Cuenta;

public interface ICuentaBancaria {
    public ICuentaBancaria abrirCuenta();
    public double getCosto();
    public void setCosto(double costo);
}
