/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.accaoutFactory;

import ec.edu.accaoutFactory.gold.GoldFactory;
import ec.edu.accaoutFactory.joven.JovenFactory;
import ec.edu.accaoutFactory.ten.TenFactory;

/**
 *
 * @author joelv
 */
public class MainAccountFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**************Cuenta Joven************");
        AccountFactory.setAccountFactory(new JovenFactory());
        AccountFactory joven = AccountFactory.getAccountFactory();
        System.out.println(joven.getAccount().Show());
        System.out.println(joven.getDebitCard().Show());
        System.out.println(joven.getCreditCard().Show());
        
        System.out.println("\n**************Cuenta 10************");
        AccountFactory.setAccountFactory(new TenFactory());
        AccountFactory ten = AccountFactory.getAccountFactory();
        System.out.println(ten.getAccount().Show());
        System.out.println(ten.getDebitCard().Show());
        System.out.println(ten.getCreditCard().Show());
        
        System.out.println("\n**************Cuenta Oro************");
        AccountFactory.setAccountFactory(new GoldFactory());
        AccountFactory gold = AccountFactory.getAccountFactory();
        System.out.println(gold.getAccount().Show());
        System.out.println(gold.getDebitCard().Show());
        System.out.println(gold.getCreditCard().Show());
    }
    
}
