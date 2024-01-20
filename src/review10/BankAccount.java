package review10;

public class BankAccount {
   private double balance;
   private String userName;
   private String password;

    BankAccount(double balance, String userName, String password) {
        setUserName(userName);  // initialize fields with some condition in setter method
        setPassword(password);
        setBalance(balance);

    }


    void setBalance(double balance) { // setter is always void

        if (balance < 0) {    // you have to but if condition to not make any one put any number
            System.out.println("Wrong Balance amount");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    void setUserName(String userName){

        if(userName.length()<4){
            System.out.println("UserName should be more than 4 characters");
        }else{
            this.userName=userName;
        }
    }

    void setPassword(String password){
        this.password=password;
    }

    void transferFunds(double amountToTransfer) {
        balance = balance - amountToTransfer;
    }

    double getBalance(){
        return balance;
    }

}
class BankTester{
    public static void main(String[] args) {

        BankAccount b=new BankAccount(1200,"Username123","Pass123");

        b.setBalance(4500);
        System.out.println(b.getBalance());

    }
    }

