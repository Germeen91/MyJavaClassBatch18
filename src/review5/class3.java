package review5;

import java.util.Arrays;

public class class3 {
    public static void main(String[] args) {


String [] student=new String[5];

        student[0]="gege";
        student[1]="sino";
        student[2]="besho";
        student[3]="sevo";
        student[4]="koke";


        for (int i=0; i< student.length; i++){


            if (student[i].equals("besho")){

                student[i]="Perfect Dad";
            }
            System.out.println(student[i]);
            }


        //if you just want to print the items in a row from array we can use this
        System.out.println(Arrays.toString(student));
        }



    }

