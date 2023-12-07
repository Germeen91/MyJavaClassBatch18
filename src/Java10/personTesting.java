package Java10;

public class personTesting {
    public static void main(String[] args) {


        person person1=new person();
       person1.name="Steven";
       person1.hairColor="Brown";
       person1.gender='M';
       person1.age=25;
        System.out.println(person1.name);
        System.out.println(person1.hairColor);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        person1.run();
        person1.smile();
        person1.talk();

        System.out.println("...................");


        person person2=new person();
        person2.name="Germeen";
        person2.hairColor="Black";
        person2.gender='F';
        person2.age=23;
        System.out.println(person2.name);
        System.out.println(person2.hairColor);
        System.out.println(person2.age);
        System.out.println(person2.gender);

        person2.run();
        person2.smile();
        person2.talk();

    }
}
