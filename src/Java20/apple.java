package Java20;

public class apple extends computer {

        public apple(String name, int memory, String color){
            super(name, memory, color);
            
        } // calling parent constructor

        // when we provide implementation to the abstract classes we MUST follow rules of OVERiding !!!
        // Sme method name and parameter MUST be same - method signature MUST be same
        //return type must be same
        //Access Modifier Must be same OR wider


    @Override
    public void executeCode() {
        System.out.println("Executing code on " + type + " " + name);

    }

    @Override
    public void realEmails() {
        System.out.println(name + " can read my emails");
    }

    }
