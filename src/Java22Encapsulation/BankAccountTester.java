package Java22Encapsulation;

public class BankAccountTester {
    public static void main(String[] args) {

       BankAccount b=new BankAccount(3000,"germeen","trump123");

        System.out.println(b.getBalance());
b.setBalance(250000);
        System.out.println(b.getBalance());

    }
}
