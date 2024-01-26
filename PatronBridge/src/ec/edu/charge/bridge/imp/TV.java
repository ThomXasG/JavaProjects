/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.bridge.imp;

/**
 *
 * @author joelv
 */
public class TV implements IDevice{
    private boolean encendido = false;
    private int volume = 30;
    private int channel = 1;
    
    @Override
    public boolean isEnabled() {
        return encendido;
    }

    @Override
    public void enable() {
        this.encendido = true;
    }

    @Override
    public void disable() {
        this.encendido = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            this.volume = 100;
        } else if (percent < 0) {
            this.volume = 0;
        } else {
            this.volume = 0;
        }
    }

    @Override
    public int getchannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printState() {
        System.out.println("----------------------\n"
                + "Yo soy una TV\n"
                + "Yo estoy: " + (this.encendido ? "Habliltada" : "Inhabilitada") + "\n"
                        + "El volumen actual es: " + this.volume + "%\n"
                                + "El canal actual es: " + this.channel + "\n"
                                        + "----------------------\n");
    }
    
}
