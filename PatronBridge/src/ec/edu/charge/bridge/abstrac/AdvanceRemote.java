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
public class AdvanceRemote extends BasicRemote{ 
    public AdvanceRemote(IDevice device){
        super(device);
    }
    
    public void mute() {
        System.out.println("Remoto: Boton Mute");
        this.device.setVolume(0);
    }
}
