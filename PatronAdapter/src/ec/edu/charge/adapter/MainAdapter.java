/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.charge.adapter;

/**
 *
 * @author joelv
 */
public class MainAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "Higher Grounds.mp3");
        audioPlayer.play("mp4", "Camisa Negra.mp4");
        audioPlayer.play("vlc", "Happy Feets.vlc");
        audioPlayer.play("wav", "voz.wav");
    }
    
}
