package Java23LinkedList;

import java.util.HashSet;
//Create a Set that will hold Objects of Student Type.
// In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.
public class Task4Student {
    private String name;
    private String id;

    public Task4Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*void printInfo(){
        System.out.println(name+" "+id);
    }*/
    public static void main(String[] args) {

        HashSet<Task4Student> students=new HashSet<>();


        students.add(new Task4Student("Engin","123"));
        students.add(new Task4Student("Kat","456"));
        students.add(new Task4Student("Masimo","789"));
        students.add(new Task4Student("Koke","563"));


        for (Task4Student s:students){
            System.out.println(s.getName());//because want display names only
            //s.printInfo();

        }




       /* Task4Student s1=new Task4Student("ko","23");
        Task4Student s2=new Task4Student("ko","23");
        Task4Student s3=new Task4Student("ko","23");
students.add(s1);
students.add(s2);
students.add(s3);*/




    }
}
