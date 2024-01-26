/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.accaoutFactory.gold;

import ec.edu.accaoutFactory.CreditCard;

/**
 *
 * @author joelv
 */
public class CredtiCardGold implements CreditCard{

    @Override
    public String Show() {
        return "Se ha creado una tarjeta de credito tipo Oro con importe de $20 y monto maximo de $4000";
    }
    
}
