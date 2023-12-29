package Java14;

public class Account {
    String accountNumber="123456";
    double balance=350;
    String userName="user123";
    private String password="pass123";


    void printInfo(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account a=new Account();
        System.out.println(a.password); // work because in the same class

        a.printInfo();
    }

}
