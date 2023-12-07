package Java9;

public class Task1 {
    public static void main(String[] args) {


        // Create 2D array (shorter way) in which first array will consist
        // of 4 names and second array will contain grades .
        // then your program should print name of the student that has A and B grade.

        String [][] students={
                {"Germeen","Steven","Mathu","Jonathan"},
                {"A","B","C","D"}

        };

      for (int p=0; p<students[0].length; p++){  //OR    p< 4    .because we need size elements of 0 row individual student[0].length no student.length how many row

          if (students[1][p].equals("A") || students[1][p].equals("B"))

          System.out.println(students[0][p]+" "+students[1][p]);
                // row name                     //  row grade
      }




        }

    }

