package Java14;

public class StudentsTester {
    public static void main(String[] args) {

        Students s1=new Students();
        s1.name="Germeen";
        s1.ID=6;
        s1.print();
        Students.numberOfStudent++;



        Students s2=new Students();
        s2.name="Steven";
        s2.ID=7;
        s2.print();
        Students.numberOfStudent++;

        System.out.println("Total number of Students "+Students.numberOfStudent);

    }
}
