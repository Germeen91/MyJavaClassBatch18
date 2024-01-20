package Java22Encapsulation;

public class BankAccountTester {
    public static void main(String[] args) {

       BankAccount b=new BankAccount(3000,"germeen","trump123");

        System.out.println(b.getBalance()); // print out because get it just retrieve
b.setBalance(250000); // set help us to modify
        System.out.println(b.getBalance());

    }
}
