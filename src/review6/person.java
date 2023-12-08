package review6;

public class person {
    String name;
    int age;
    double weight;
    double height;

    void eat(){
        System.out.println("Eating.......");
    }


    public static void main(String[] args) {

        person p=new person();
        p.name="Karimi";
        p.age=22;
        p.weight=5.4;
        p.height=120;
        System.out.println(p.name);

        p.eat();    // no datatype because it is void nothing
    }

}
