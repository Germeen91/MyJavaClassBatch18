package Java13;

public class Printer {


    void printHello() {
        System.out.println("Hello World");
    }// void is method/return type/output
    //printHello name of method
    // no parameter, no input


    void printWord(String word) {

        System.out.println(word);
    }
// void is method /return type/output
    //printWord name of method
    // String parameter, String input


    void printManyTimes(String word,int n){

        for (int i=0; i<n; i++){
            System.out.println(word);
        }
        // void is method /return type/output
        //printManyTimes name of method
        // String , int   are parameters, input


    }



}