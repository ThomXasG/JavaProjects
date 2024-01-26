package ec.edu.carlos.adapter;


public class Mp4Player implements IAdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //No hace nada
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Reproduccion del archivo Mp4. Nombre = "+fileName);
    }
    
}
