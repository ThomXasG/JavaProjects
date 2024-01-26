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
public class Ios extends OperativeSystem {

    public Ios(String version) {
        super(version);
    }

    @Override
    public OperativeSystem clonar() {
        Ios ios = null;

        try {
            ios = (Ios) clone();
            ios.setApps(new ArrayList<>(this.getApps()));
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return ios;
    }

}
