package Java15;

public class student {

    private  String name;
    private  double subject1;
    private double subject2;
    private  double subject3;


    public student(String pName, int pSubject1, int pSubject2, int pSubject3){
        name=pName;
        subject1=pSubject1;
        subject2=pSubject2;
        subject3=pSubject3;

    }

    public void printInfo(){

        System.out.println(name+" average "+((subject1+subject2+subject3)/3));
    }

}
