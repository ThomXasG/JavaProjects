/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.singleton;

/**
 *
 * @author joelv
 */
public class Employee {
    private String name;
    private String role;
    private String assignment;

    public Employee() {
    }

    public Employee(String name, String role, String assignment) {
        this.name = name;
        this.role = role;
        this.assignment = assignment;
    }
    
    public void printCurrentAssignment() {
        Printer printer = Printer.getInstance();
        printer.Print("Employee: " + name + "\n"
                + "Role: " + role + "\n" 
                + "Assignment: " + assignment);
    }
}
