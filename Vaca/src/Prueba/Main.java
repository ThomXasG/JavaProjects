/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prueba;

/**
 *
 * @author joelv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("Thomas", "Vaca", "Ross", 20, "UTA", 5);
        e.clone();
        e.MostrarDatos();
        System.out.println("\n----------------------------------------------------\n");
        
        Empleado em = new Empleado("Daniel", "Vaca", "Toscano", 51, 18024, "Supervisor");
        em.clone();
        em.MostrarDatos();
    }
    
}
