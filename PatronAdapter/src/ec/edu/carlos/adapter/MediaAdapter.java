package ec.edu.carlos.adapter;

class MediaAdapter implements IMediaPlayer{
    //Adaptador
    
    IAdvancedMediaPlayer advanccedMediaPlayer;

    public MediaAdapter(String typeAudio) {
        if(typeAudio.equalsIgnoreCase("vlc")){
            advanccedMediaPlayer = new VlcPlayer();
        }else if(typeAudio.equalsIgnoreCase("mp4")){
            advanccedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String typeAudio, String fileName) {
        if(typeAudio.equalsIgnoreCase("vlc")){
            advanccedMediaPlayer.playVlc(fileName);
        }else if(typeAudio.equalsIgnoreCase("mp4")){
            advanccedMediaPlayer.playMp4(fileName);     
        }
    }
    
    
}
