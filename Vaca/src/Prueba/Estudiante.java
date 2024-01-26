/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

/**
 *
 * @author joelv
 */
public class Estudiante extends Persona{
    private int Semestre;
    private String NomEscuela;

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getNomEscuela() {
        return NomEscuela;
    }

    public void setNomEscuela(String NomEscuela) {
        this.NomEscuela = NomEscuela;
    }
    
    public Estudiante(String Nombre, String ApPaterno, String ApMaterno, int Edad, String NomEscuela, int Semestre) {
        super(Nombre, ApPaterno, ApMaterno, Edad);
        this.setNomEscuela(NomEscuela);
        this.setSemestre(Semestre);
    }

    @Override
    public Persona clone() {
        return new Estudiante(this.getNombre(), this.getApPaterno(), this.getApMaterno(), this.getEdad(), this.NomEscuela, this.Semestre);
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Nombre: " + this.getNombre() + "\n"
                + "Apellido Paterno: " + this.getApPaterno() + "\n"
                        + "Apellido Materno: " + this.getApMaterno() + "\n"
                                + "Edad: " + this.getEdad() + "\n"
                                        + "Semestre: " + this.getSemestre() + "\n"
                                                + "Nombre Escuela: " + this.getNomEscuela());
    }
    
}
