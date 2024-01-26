/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public abstract class OperativeSystem implements Prototype{
    
    private String version;
    private List<String> apps;

    public OperativeSystem(String version) {
        this.version = version;
        this.apps = new ArrayList<>();
    } 

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    public List<String> getApps() {
        return apps;
    }
    
    public void addApps(String app){
        this.apps.add(app);
    }
    
    public void showApps(){
        System.out.println("Las aplicaciones preinstaladas en esta version son: "+this.version);
        for(String app: apps){
            System.out.println("Nombre: "+app);
        }
    }


    
}
