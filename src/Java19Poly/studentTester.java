package Java19Poly;

public class studentTester {
    public static void main(String[] args) {
// polymorphism works with methods override from parent class


        student [] array={new syntaxStudent(),new collegeStudent(),new schoolStudent()};

        for (int i=0; i< array.length; i++){

            student s=array[i];

            s.study();

            //if subclass has unique method

          /* if(student instanceof syntaxStudents ){
                syntaxStudents s=  (SyntaxStudents)student;
                s.play();*/
            }

        }
    }

