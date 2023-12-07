package Java11;

public class StringDemo11 {
    public static void main(String[] args) {



        String str="lkijt sHGDC B#$#*^$@!@123";

        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));

        System.out.println(str.replaceAll("[A-D]","*"));
        System.out.println(str.replaceAll("[A-Za-z]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));

        System.out.println(str.replaceAll("[^A-Z]","*")); // not ^ replace uppercase
        System.out.println(str.replaceAll("[^A-Za-z]","*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));

        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));

//https://cdn.discordapp.com/attachments/1165291679713087609/1180588900817846293/Figure-1-15-1024x601.png?ex=657df818&is=656b8318&hm=f444ef4fe0b75a4dbebb6bfacdd3e2c6dd11e96a1f82d71f09cd9563501f8e67&
        System.out.println(str.replaceAll("[#-*]",""));
        System.out.println(str.replaceAll("[\\d]","")); // d backward slash D means digit
        System.out.println(str.replaceAll("[#-*]",""));
        System.out.println(str.replaceAll("[\\s]",""));
        //   https://regexr.com/   (cheat sheet)

        System.out.println(str.replaceAll("[^AaEeUuIiOo]" ,"")); //to remain the vowel letters





    }
}
