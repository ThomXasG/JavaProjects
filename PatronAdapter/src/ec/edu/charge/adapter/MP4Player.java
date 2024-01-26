/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.adapter;

/**
 *
 * @author joelv
 */
public class MP4Player implements IAdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        // No hace nada
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Reproduccion de archivos MP4. Nombre = " + fileName);
    }
    
}
