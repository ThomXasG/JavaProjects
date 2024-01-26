/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.adapter;

/**
 *
 * @author joelv
 */
public class AudioPlayer implements IMediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String typeAudio, String fileName) {
        if (typeAudio.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduccion de archivo MP3. Nombre: " + fileName);
        } else if (typeAudio.equalsIgnoreCase("vlc") || 
                (typeAudio.equalsIgnoreCase("mp4"))) {
            mediaAdapter = new MediaAdapter(typeAudio);
            mediaAdapter.play(typeAudio, fileName);
        } else {
            System.out.println("Multimedia no valido. " + typeAudio + " Formato no soportado");
        }
    }
    
}
