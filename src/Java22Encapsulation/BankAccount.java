package Java22Encapsulation;
//Encapsulation in Java is a mechanism for
//wrapping the data (variables) and code acting on
//the data (methods) together as a single unit
/////////////////////////////////////////////////////
//1-create a separate class for every entity and
// define the methods instead of putting every thing inside the main method
// 2-must put instance var privet those (not read+ not write) So we have to create constructor
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

    public double getBalance() {  //create it in parent class to read privet data in child
        return balance;
    }

    public void setBalance(double balance) {  // to modify privet data
        this.balance = balance;
    }
}

