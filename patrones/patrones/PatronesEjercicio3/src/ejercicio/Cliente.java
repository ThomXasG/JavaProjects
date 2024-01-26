/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Asus
 */
public class Cliente {

    public static void main(String[] args) {
        OperativeSystem android = new Android("02.12");
        android.addApps("Crome");
        android.addApps("Mensajes");
        android.addApps("Camara");
        android.addApps("GPS");
        android.showApps();
        
        OperativeSystem ios = new Ios("05.1");
        ios.addApps("Safari");
        ios.addApps("Mensajes");
        ios.addApps("Camara");
        ios.addApps("GPS");
        ios.showApps();
        
        OperativeSystem androidOreo = android.clonar();
        androidOreo.addApps("Youtube");
        androidOreo.addApps("TikTolk");
        androidOreo.showApps();
        
        OperativeSystem ios14 = ios.clonar();
        ios14.addApps("Twitch");
        ios14.addApps("Vimeo");
        ios14.showApps();
        
    }
}
