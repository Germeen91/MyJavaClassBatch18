package Java13;


//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
//score > 90 - A
//score >80 - B
//score >70 - C
//score > 50 - D
//anything else - F


public class Hw3 {

    char getGrade(int score){
        if (score >90){
            return 'A';
        } else if ((score<=90)  && (score>80) ){
            return 'B';
        } else if ((score<=80)   && (score >70)) {
            return 'C';
        } else if ((score <=70)  && (score>50)) {
            return 'D';
        }else {return 'F';}


    }


    public static void main(String[] args) {

        Hw3 obj=new Hw3();

        char x=obj.getGrade(50);
        System.out.println("your grade is "+x);
    }
}
