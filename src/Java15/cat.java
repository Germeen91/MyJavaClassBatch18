package Java15;

public class cat {

    private String name;
    private String color;  // instance var
    private int age;


    public cat(String name, String color, int age) {  // Local var the same name of instance
        this.name = name;                             //so i have to transfer from local (null empty) to instance
        this.color = color;                          // to pass var those are privet and initialize instance privet var
        this.age = age;

    }


    public void printInfo() {

        System.out.println(name + " " + color + " " + age);
    }

    public static void main(String[] args) {
        cat c = new cat("Kitti", "White", 13);
        c.printInfo();


    }
}