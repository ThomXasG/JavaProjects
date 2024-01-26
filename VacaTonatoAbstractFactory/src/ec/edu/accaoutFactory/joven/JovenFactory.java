/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.accaoutFactory.joven;

import ec.edu.accaoutFactory.Account;
import ec.edu.accaoutFactory.AccountFactory;
import ec.edu.accaoutFactory.CreditCard;
import ec.edu.accaoutFactory.DebitCard;

/**
 *
 * @author joelv
 */
public class JovenFactory extends AccountFactory{
    private Account account;
    private CreditCard creditCard;
    private DebitCard debitCard;

    @Override
    public Account getAccount() {
       if (account == null) {
           account = new AccountJoven();
       }
       return account;
    }

    @Override
    public CreditCard getCreditCard() {
        if (creditCard == null) {
           creditCard = new CreditCardJoven();
       }
       return creditCard;
    }

    @Override
    public DebitCard getDebitCard() {
        if (debitCard == null) {
           debitCard = new DebitCardJoven();
       }
       return debitCard;
    }
}
