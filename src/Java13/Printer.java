package Java13;

public class Printer {


    void printHello() {
        System.out.println("Hello World");
    }// void is method
    //printHello name of method
    // no parameter, no input


    void printWord(String word) {
        System.out.println(word);
    }
// void is method
    //printWord name of method
    // String parameter, String input


    void printManyTimes(String word,int n){

        for (int i=0; i<n; i++){
            System.out.println(word);
        }
        // void is method
        //printManyTimes name of method
        // String , int   are parameters, input


    }



}