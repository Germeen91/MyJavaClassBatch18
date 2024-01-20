package Java16Inheritance;


//Write program to inherit class E that has method printF which is static and call or reuse that method into class F
public class E {

    static void printF() {
        System.out.println("Hello Batch");
    }
}

    class F extends E {

    }

    class ETester {
        public static void main(String[] args) {
            F.printF();    // Static method not need obj just class name >> name of method
        }
    }
