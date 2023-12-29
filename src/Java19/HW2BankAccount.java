package Java19;
/*2)Banking System Task: Design a BankAccount class with subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount.
Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform operations like depositing and withdrawing funds.*/
public class HW2BankAccount {
    private String accountNumber;
    private int balance;
    private String accountHolderName;

    public HW2BankAccount(String accountNumber, int balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void printInfo(){
        System.out.println("Account Number : "+accountNumber+" Your Balance : "+balance+" Account Holder Name : "+accountHolderName);
    }
    void withdraw(int amount){
        System.out.println("The maximum of withdraw is "+amount+" per day");
    }
    void deposit(int money,int balance ){
        System.out.println("Your Balance now "+(money+balance));
    }
}
class SavingsAccount extends HW2BankAccount{
    public SavingsAccount(String accountNumber, int balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    void withdraw(int amount){
        System.out.println("The maximum of withdraw is "+amount);
    }
    void deposit(int money,int balance ){
        System.out.println("Your Balance now "+(money+balance));
    }
    void applyInterest(double interest ){
        System.out.println("If you apply now you will get interest  "+interest+" %");
    }
}
class CheckingAccount extends HW2BankAccount{
    public CheckingAccount(String accountNumber, int balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    void withdraw(int amount){
        System.out.println("The minimum of withdraw is "+amount+" per day");
    }
    void deposit(int money,int balance ){
        System.out.println("you put "+money+" So,your Balance became "+(balance+money));
    }
}
class FixedDepositAccount extends HW2BankAccount{
    public FixedDepositAccount(String accountNumber, int balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    void withdraw(int amount){
        System.out.println("You Withdrew  "+amount+" $ Today . So, your balance decrease");
    }
    void deposit(int money,int balance ){
        System.out.println("You deposited  "+money+" $ Today and your balance became "+(money+balance));
    }
}
class BankAccountTester{
    public static void main(String[] args) {

        HW2BankAccount []array={new SavingsAccount("A256",5000,"Steven"),
                new CheckingAccount("A330",1000,"Germeen"),
                new FixedDepositAccount("A568",1500,"George")};

        for (int i=0; i< array.length;i++){
            HW2BankAccount B=array[i];
            B.printInfo();

            if (B instanceof SavingsAccount){
                SavingsAccount S=(SavingsAccount) B;
                S.withdraw(200);
                S.deposit(500,5000);
                S.applyInterest(15);
            }
            if (B instanceof CheckingAccount){
                CheckingAccount C=(CheckingAccount) B;
                C.withdraw(100);
                C.deposit(100,1000);
            }
            if (B instanceof FixedDepositAccount){
                FixedDepositAccount F=(FixedDepositAccount) B;
                F.withdraw(50);
                F.deposit(150,1500);
            }

            System.out.println(".......................");
        }
    }
}