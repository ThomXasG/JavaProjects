/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.proxy.service;

/**
 *
 * @author joelv
 */
public class SecurityService {
    public boolean authorization(String user, String password) {
        if (user.equals("Marvic") && password.equals("1234")) {
            System.out.println("Usuario: " + user + " autorizado");
            return true;
        } else {
            System.out.println("Usuario: " + user + " no autorizado");
            return false;
        }
    }
}
