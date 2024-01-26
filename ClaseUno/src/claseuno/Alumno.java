/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseuno;

/**
 *
 * @author joelv
 */
public abstract class Alumno extends Persona {
    String Matricula;
    
    public Alumno(String Nombre, String Apellido, String Edad) {
        super(Nombre, Apellido, Edad);
    }
    
    public Alumno(String Nombre, String Apellido, String Edad, String Matricula) {
        super(Nombre, Apellido, Edad);
        this.Matricula = Matricula;
    }
    
    public Alumno(String Nombre, String Matricula) {
        super(Nombre);
        this.Matricula = Matricula;
    }
    
    public Alumno(){
        super();
        this.Matricula = "0000";
    }
}