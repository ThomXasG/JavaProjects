/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseuno;

/**
 *
 * @author joelv
 */
public class Persona {
    String Nombre;
    String Apeelido;
    String Edad;
    
    public Persona(String Nombre, String Apellido, String Edad){
        this.Nombre = Nombre;
        this.Apeelido = Apellido;
        this.Edad = Edad;
    }
    
    public Persona(String Nombre, String Apellido){
        this.Nombre = Nombre;
        this.Apeelido = Apellido;
    }
    
    public Persona(String Nombre){
        this.Nombre = Nombre;
    }
    
    public Persona() {
        this.Nombre = "No tiene nombre";
        this.Apeelido = "No tiene apellido";
        this.Edad = "0";
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApeelido() {
        return this.Apeelido;
    }

    public void setApeelido(String Apeelido) {
        this.Apeelido = Apeelido;
    }

    public String getEdad() {
        return this.Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
    public void imprimir(){
        System.out.println(Nombre + " " + Apeelido + " " + Edad);
    }
    
    @Override
    public String toString(){
        return "nombre = " + Nombre + ", Apellido = " + Apeelido + ", Edad = " + 
                Edad;
    }
}
