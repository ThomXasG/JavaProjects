/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.accaoutFactory.joven;

import ec.edu.accaoutFactory.CreditCard;

/**
 *
 * @author joelv
 */
public class CreditCardJoven implements CreditCard{

    @Override
    public String Show() {
        return "Se creo una tarjeta de credito gratuita tipo Joven con monto maximo de $600";
    }
    
}
