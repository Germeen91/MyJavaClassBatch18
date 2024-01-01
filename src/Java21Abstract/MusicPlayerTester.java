package Java21Abstract;

public class MusicPlayerTester {
    public static void main(String[] args) {
        MusicPlayer [] array={new MP3Player("Jazz Music",35),
        new CDPlayer("Dance Music",40),
                new StreamingPlayer("Rock Music",45)};

        for (int i=0; i< array.length; i++){
            MusicPlayer M=array[i];
            M.play();
            M.pause();
            M.stop();

            System.out.println("..................");
        }


    }
}
