package Java22Encapsulation;
// must have to but instance var privet not read+ not write So we have to create constructor
//Encapsulate expose data, but in read only manner, no changes can be made
public class BankAccount {
   private double balance;
    private String userName;
    private String password;

    public BankAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    void login(){
        System.out.println("Login to bank account");
    }
    void  transferFunds(){
        System.out.println("transfer funds");
    }
void resetPassword(){
    System.out.println("Reset password");
}

    public double getBalance() {  // to read privet data
        return balance;
    }

    public void setBalance(double balance) {  // to modify privet data
        this.balance = balance;
    }
}

