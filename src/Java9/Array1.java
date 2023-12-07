package Java9;

public class Array1 {
    public static void main(String[] args) {



        String [][] students= {
                {"Muhayyo", "Azam", "Abdulloh", "Maryam"},

                {"A", "B", "A", "D"}};


        for(int i=0; i<4;i++){

            if(students[1][i].equals("A")||students[1][i].equals("B"))

                System.out.println(students[0][i]+" "+students[1][i]);
        }


            }
        }




