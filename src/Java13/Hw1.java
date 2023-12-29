package Java13;
//Create a method createEmail(). Based on values of users firstName, lastName and email type,
// your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
public class Hw1 {

    String createEmail(String firstName,String lastName,String emailType){
        return firstName+lastName+emailType;

    }


    public static void main(String[] args) {

        Hw1 obj=new Hw1();

        String email=obj.createEmail("germeen.","R","@gmail.com");

        System.out.println(email);

    }




}
