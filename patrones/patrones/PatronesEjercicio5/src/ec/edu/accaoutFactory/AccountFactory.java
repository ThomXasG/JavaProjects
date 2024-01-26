/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.accaoutFactory;

/**
 *
 * @author joelv
 */
public abstract class AccountFactory {
    private static AccountFactory accountFactory;
    
    public static void setAccountFactory(AccountFactory accountFactory) {
        AccountFactory.accountFactory = accountFactory;
    }
    
    public static AccountFactory getAccountFactory() {
        return accountFactory;
    }
    
    public abstract Account getAccount();
    public abstract CreditCard getCreditCard();
    public abstract DebitCard getDebitCard();
    public abstract Gift getGift();
}
