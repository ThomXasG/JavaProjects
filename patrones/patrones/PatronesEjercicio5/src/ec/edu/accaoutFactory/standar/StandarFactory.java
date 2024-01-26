/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.accaoutFactory.standar;

import ec.edu.accaoutFactory.Account;
import ec.edu.accaoutFactory.AccountFactory;
import ec.edu.accaoutFactory.CreditCard;
import ec.edu.accaoutFactory.DebitCard;
import ec.edu.accaoutFactory.Gift;

/**
 *
 * @author Asus
 */
public class StandarFactory extends AccountFactory{
    private Account account;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private Gift gift;
    
    @Override
    public Account getAccount() {
       if (account == null) {
           account = new AccountStandar();
       }
       return account;
    }

    @Override
    public CreditCard getCreditCard() {
        if (creditCard == null) {
           creditCard = new CreditCardStandar();
       }
       return creditCard;
    }

    @Override
    public DebitCard getDebitCard() {
        if (debitCard == null) {
           debitCard = new DebitCardStandar();
       }
       return debitCard;
    }

    @Override
    public Gift getGift() {
        if(gift == null){
            gift = new GiftStandar();
        }
        return gift;
    }
    
}
