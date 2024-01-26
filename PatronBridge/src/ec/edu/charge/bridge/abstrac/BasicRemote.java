/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.bridge.abstrac;

import ec.edu.charge.bridge.imp.IDevice;

/**
 *
 * @author joelv
 */
public class BasicRemote {
    protected IDevice device;

    public BasicRemote() {
    }

    public BasicRemote(IDevice device) {
        this.device = device;
    }
    
    public void togglePower() {
        System.out.println("Remoto: Boton de encendido");
        
        if (this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }
    
    public void volumeDown() {
        System.out.println("Remoto: boton bajar volumen");
        this.device.setVolume(this.device.getVolume() - 10);
    }
    
    public void volumeUp() {
        System.out.println("Remoto: boton subir volumen");
        this.device.setVolume(this.device.getVolume() + 10);
    }
    
    public void channelDown() {
        System.out.println("Remoto: boton bajar canal");
        this.device.setChannel(this.device.getchannel() - 1);
    }
    
    public void channelUp() {
        System.out.println("Remoto: boton bajar canal");
        this.device.setChannel(this.device.getchannel() + 1);
    }
}
