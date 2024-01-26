/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Asus
 */
public abstract class Factura implements Iiva{
    private int id;
    private double importe;

    public Factura(int id, double importe) {
        this.id = id;
        this.importe = importe;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", importe=" + importe + '}';
    }
    
    
    
    
}
