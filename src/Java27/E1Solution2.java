package Java27;

public class E1Solution2 {
    public static void main(String[] args) {
//Exception >> the parent good to be in the end
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        // System.out.println(10/0);
        try{
          // System.out.println(10/0);
            String name=null;
            System.out.println(name.length());

        }catch (ArithmeticException e){
            System.out.println("please don't try to divide by zero it not allowed in java");
        } catch (NullPointerException npe){
            System.out.println("Make sure your subject is initialed properly");
        } catch (ArrayIndexOutOfBoundsException arrayIndex){
            System.out.println("Make sure your index is greater than 0 and less than the size ");
        } catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("6");

    }
}
