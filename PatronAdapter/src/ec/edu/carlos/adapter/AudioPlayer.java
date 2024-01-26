package ec.edu.carlos.adapter;

public class AudioPlayer implements IMediaPlayer{
    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String typeAudio, String fileName) {
        if(typeAudio.equalsIgnoreCase("mp3")){
            System.out.println("Reproduccion de archivo mp3. Nombre= "+fileName);
        }else if(typeAudio.equalsIgnoreCase("mp4")|| typeAudio.equalsIgnoreCase("vlc")){
            mediaAdapter= new MediaAdapter(typeAudio);
            mediaAdapter.play(typeAudio, fileName);
        }else{
            System.out.println("Multimedia no valido "+typeAudio+"\nFormato no soportado ");
        }
    }
    
}
