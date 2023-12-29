package Java21;

public class FileTester {
    public static void main(String[] args) {

        File []array={new JavaFile("Name",5),new WordFile("Name",6),new PdFile("Name",8)};
        for (int i=0; i< array.length; i++){

            File f=array[i];
            f.edit();
            f.open();
            f.close();
        }

    }
}
