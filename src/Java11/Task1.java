package Java11;

public class Task1 {
    public static void main(String[] args) {

        /*
Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”

 */


        String username="Germeen";
        String password="pass1234";
        String confirmpass="pass1234";

        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Username or Passwor can not be empty");

        } else if (password.length()<8) {
            System.out.println("Password is too short");

        } else if (password.contains(username)) {
            System.out.println("Password can not contain Username");

        } else if (! password.equals(confirmpass)) {
            System.out.println("Password don not match");

        } else {
            System.out.println("Your Username and Password has been created");
        }


    }
}
