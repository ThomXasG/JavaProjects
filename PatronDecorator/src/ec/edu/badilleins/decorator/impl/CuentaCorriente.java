/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.badilleins.decorator.impl;

import ec.edu.badilleins.decorator.inter.ICuentaBancaria;
import ec.edu.badilleins.decorator.model.Cuenta;

/**
 *
 * @author Personal
 */
public class CuentaCorriente  implements ICuentaBancaria{

    private int id;
   private String cliente;
   private double costo;

    public CuentaCorriente(int id, String cliente, double costo) {
        this.id = id;
        this.cliente = cliente;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
   
   
   @Override
    public ICuentaBancaria abrirCuenta() {
        System.out.println("*************");
        System.out.println("Se abrió una cuenta corriente");
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Costo de apertura:" + this.getCosto());
        return this;
    }

    @Override
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public double getCosto() {
        return this.costo;
    }
    
}
