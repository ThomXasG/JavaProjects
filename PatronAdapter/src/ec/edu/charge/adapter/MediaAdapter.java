/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.charge.adapter;

/**
 *
 * @author joelv
 */
class MediaAdapter implements IMediaPlayer {
    // Adaptador
    
    IAdvancedMediaPlayer advancedMaediaPlayer;

    public MediaAdapter(String typeAudio) {
        if (typeAudio.equalsIgnoreCase("vlc")) {
            advancedMaediaPlayer = new VLCPlayer();
        } else if (typeAudio.equalsIgnoreCase("mp4")) {
            advancedMaediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String typeAudio, String fileName) {
        if (typeAudio.equalsIgnoreCase("vlc")) {
            advancedMaediaPlayer.playVLC(fileName);
        } else if (typeAudio.equalsIgnoreCase("mp4")) {
            advancedMaediaPlayer.playMP4(fileName);
        }
    }
    
}
