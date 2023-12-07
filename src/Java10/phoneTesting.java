package Java10;

public class phoneTesting {
    public static void main(String[] args) {


      //  Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung create 3 to 5 attributes
      //  And three behaviours

        phone Pixel=new phone();

        Pixel.model="Pixel 8 pro";
        Pixel.color="black";
        Pixel.price=1750;
        System.out.println(Pixel.model);
        System.out.println(Pixel.color);
        System.out.println(Pixel.price);

        Pixel.call();
        Pixel.ring();
        Pixel.camera();
        System.out.println(".................");

        phone iPhone=new phone();

        iPhone.model="iPhone 15 plus";
        iPhone.color="Pink";
        iPhone.price=1399;
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.call();
        iPhone.ring();
        iPhone.camera();

        System.out.println("....................");

        phone Samsung=new phone();

        Samsung.model="Samsung S 23";
        Samsung.color="Green";
        Samsung.price=1250;
        System.out.println(Samsung.model);
        System.out.println(Samsung.color);
        System.out.println(Samsung.price);

        Samsung.call();
        Samsung.ring();
        Samsung.camera();

    }
}
