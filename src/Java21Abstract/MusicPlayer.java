package Java21Abstract;
/*Task1) Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(),
and fields such as currentTrack and volume. Implement subclasses for different types of music players,
like MP3Player, CDPlayer, and StreamingPlayer, each with their unique implementations of the play() method
 (e.g., streaming from the internet, playing from a CD).*/
public abstract class MusicPlayer {
   private String currentTrack;
   private int volume;

   MusicPlayer (String currentTrack,int volume){
this.currentTrack=currentTrack;
this.volume=volume;
   }
   public abstract void play();
   public  void pause(){
       System.out.println("Pause the music");
   }
   public  void stop(){
       System.out.println("Stop the music");
   }
}
class MP3Player extends MusicPlayer{
MP3Player(String currentTrack, int volume){
 super(currentTrack,volume) ;
}
@Override
    public  void play(){
        System.out.println("Play Music from youtube");
    }
}
class CDPlayer extends MusicPlayer{
    CDPlayer (String currentTrack,int volume){
        super(currentTrack,volume);
    }
    @Override
    public  void play(){
        System.out.println("Streaming from the internet");
    }
}
class StreamingPlayer extends MusicPlayer{
    StreamingPlayer(String currentTrack,int volume ){
        super(currentTrack,volume);
    }
    @Override
    public  void play(){
        System.out.println("playing from a CD");
    }
}