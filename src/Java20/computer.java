package Java20;

public abstract class computer {
    // Variable  >>>  data type + name
    // instance Var
    String name;
    int memory;
    String color;
    // Variable  >>>  data type + name
    // static Var
    static String type; // this var belong to class

    computer(String name, int memory, String color) {
        this.name = name;
        this.memory = memory;
        this.color = color;
    }

    // // Methods     >> return type + name (){}
                                                 // access / non access modifiers are optional
   /* public static void playMusic() {            // if we add static modify only work static var  // final means something is completed not able to override
        System.out.println("I can play music on my " + type);
    }*/

   /* protected void printInfo() {
        System.out.println("I have "+name+" computer with "+memory+" memory");
    }*/



    //Abstract means something is incomplete and the class also add abstract
    //No implementation
   public abstract void executeCode();
   public abstract void realEmails();

}
