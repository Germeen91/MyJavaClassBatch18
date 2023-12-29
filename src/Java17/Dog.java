package Java17;
class Animal{

   private String name;    // fields is better to be privet
                          // but to be access to dog and cat class we have to create public void
   private String color;
    private int age;
   private double weight;


    public Animal() { // empty constructor
    }

    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void printInfo(){
       System.out.println(name +" "+color+" "+age+" "+weight);
   }

}
public class Dog extends Animal {

Dog (String name, String color, int age, double weight){
    super(name,color,age,weight);
}// we have to create constructor for child
    // depend on  parent constructor

}
class cat extends Animal{

cat (){   // if we did not create child constructor java will create
    // empty constructor behind screen
    super();
}


}