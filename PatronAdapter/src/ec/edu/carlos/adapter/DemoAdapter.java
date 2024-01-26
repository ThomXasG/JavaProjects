package ec.edu.carlos.adapter;

/**
 *
 * @author g4to1
 */
public class DemoAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "El mundo de mi almohada.mp3");
        audioPlayer.play("mp4", "Sinmigo.mp4");
        audioPlayer.play("vlc", "Plural siendo singular.vlc");
        audioPlayer.play("wav", "Plural siendo singular.wav");
    }
    
}
