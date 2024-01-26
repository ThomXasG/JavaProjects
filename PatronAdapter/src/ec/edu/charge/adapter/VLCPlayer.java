/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.adapter;

/**
 *
 * @author joelv
 */
public class VLCPlayer implements IAdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Reproduccion de archivo VLC. Nombre: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        // No hace nada
    }
    
}
