/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Android extends OperativeSystem{

    public Android(String version) {
        super(version);
    }

    
    @Override
    public OperativeSystem clonar() {
        Android android = null;

        try {
            android = (Android) clone();
            android.setApps(new ArrayList<>(this.getApps())); 
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return android;
    }
    
}
