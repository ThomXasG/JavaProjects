/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

/**
 *
 * @author joelv
 */
public class Empleado extends Persona{
    private int numEmpleado;
    private String Puesto;

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }
    

    public Empleado(String Nombre, String ApPaterno, String ApMaterno, int Edad, int numEmpleado, String Puesto) {
        super(Nombre, ApPaterno, ApMaterno, Edad);
        this.setNumEmpleado(numEmpleado);
        this.setPuesto(Puesto);
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Nombre: " + this.getNombre() + "\n"
                + "Apellido Paterno: " + this.getApPaterno() + "\n"
                        + "Apellido Materno: " + this.getApMaterno() + "\n"
                                + "Edad: " + this.getEdad() + "\n"
                                        + "Num. Empleado: " + this.getNumEmpleado() + "\n"
                                                + "Puesto: " + this.getPuesto());
    }

    @Override
    public Persona clone() {
        return new Empleado(this.getNombre(), this.getApPaterno(), this.getApMaterno(), this.getEdad(), this.getNumEmpleado(), this.getPuesto());
    }
    
}
