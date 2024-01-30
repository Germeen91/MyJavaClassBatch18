package Java12;

public class Task4 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL */

        String FirstMotherName="Mary";
        String FirstFatherName="Daniel";

        boolean boy=true;
boolean girl=true;

        if (boy){
            System.out.println(FirstFatherName.substring(0,3) + FirstMotherName.substring(2,4));}

        if (girl){
            System.out.println(FirstMotherName.substring(0,2)+ FirstFatherName.substring(3,6));
        }

////////////////////////////////////////////////////////

        if (boy){
            System.out.println(FirstFatherName.substring(0,FirstFatherName.length()/2) +FirstMotherName.substring(FirstMotherName.length()/2));
        } else if (girl) {
            System.out.println(FirstMotherName.substring(0,FirstMotherName.length()/2) +FirstFatherName.substring(FirstFatherName.length()/2));

        }








    }
}
