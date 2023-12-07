package Java5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
// Write a program that will read three inputs of scores (quiz, mid term, and final scores) from 0-100
// and determine the grade based on the following rules:
//if the average score >=90 → grade=A
//if the average score >= 70 and <90 → grade=B
//if the average score>=50 and <70 → grade=C
//if the average score<50 → grade=F

        Scanner sc=new Scanner(System.in);




        System.out.println("enter the mark for your quiz 0-100");
         double quiz=sc.nextDouble();

        System.out.println("enter the mark for your mind term 0-100");
        double midTerm=sc.nextDouble();

        System.out.println("enter the mark for your final scores 0-100");
        double finalScores=sc.nextDouble();

        double ava=((quiz+midTerm+finalScores)/3);


        if(ava>=90){

        System.out.println("grade A");
        } else if (ava>=70 && ava<90) {
            System.out.println("grade B");

        } else if (ava>=50 && ava <70) {
            System.out.println("grade C");

        }else if (ava<50){
            System.out.println("grade F");
        }


    }
}
