package ec.edu.carlos.adapter;

/**
 *
 * @author g4to1
 */
public class VlcPlayer implements IAdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Reproduccion del archivo Vlc. Nombre = "+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //No hace nada
    }
    
}
