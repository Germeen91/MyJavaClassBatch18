package Java15;

public class Dog {

    private String name; // private to not any one edite our value (to protract access)
    private String breed;
    private String color;
    private int age;

    // contracture
    public Dog(String dname,String dbreed,String dcolor, int dage) {
        name=dname;
        breed=dbreed;
        color=dcolor;
        age=dage;
    }


    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age);
    }


}
