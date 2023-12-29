package review7;
/*Write program: User that has a constructor that initializes instance variable name and mobile number.
Create a subclass/child class  userInfo that will have user address variable
and it also being initialized through constructor call. Print users name, mobile number
and address in userDetails method. Test your code.*/
public class HW1 {


    private String name;
    private String mobileNumber;

    public HW1(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public void print(){
        System.out.println(name + " "+ mobileNumber);
    }
}

class userInfo extends HW1{
    String address;

    public userInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }
    public void print2(){
        System.out.println(address);
    }

    public void userDetails(){
          super.print();
          this.print2();


    }

    public static void main(String[] args) {

        userInfo obj=new userInfo("Germeen","424455269","California");
        obj.userDetails();

    }
}

