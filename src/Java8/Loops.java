package Java8;

public class Loops {
    public static void main(String[] args) {

        /*write a loop to print these letters in reverse order*/


        char [] word={'s','u','n','d','a','y'};

        for (int i=5;i>=0;i--){
            System.out.print(word[i]+" ");
        }
        System.out.println();





for (int p= word.length -1; p>=0; p--){ /// length is how many numbers{Size} and size always less -1 the index
    System.out.print(word[p]+" ");
}
    }
}
