/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.accaoutFactory.gold;

import ec.edu.accaoutFactory.Account;
import ec.edu.accaoutFactory.AccountFactory;
import ec.edu.accaoutFactory.CreditCard;
import ec.edu.accaoutFactory.DebitCard;
import ec.edu.accaoutFactory.Gift;
import ec.edu.accaoutFactory.joven.AccountJoven;
import ec.edu.accaoutFactory.joven.CreditCardJoven;
import ec.edu.accaoutFactory.joven.DebitCardJoven;

/**
 *
 * @author joelv
 */
public class GoldFactory extends AccountFactory{
    private Account account;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private Gift gift;
    
    @Override
    public Account getAccount() {
       if (account == null) {
           account = new AccountGold();
       }
       return account;
    }

    @Override
    public CreditCard getCreditCard() {
        if (creditCard == null) {
           creditCard = new CredtiCardGold();
       }
       return creditCard;
    }

    @Override
    public DebitCard getDebitCard() {
        if (debitCard == null) {
           debitCard = new DebitCardGold();
       }
       return debitCard;
    }

    @Override
    public Gift getGift() {
        if(gift == null){
            gift = new GiftGold();
        }
        return gift;
    }
}
