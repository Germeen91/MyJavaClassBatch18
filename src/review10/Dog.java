package review10;

public class Dog {
    private  String name;
    private  String bread;
    private  int age;

    public Dog(String name, String bread, int age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
