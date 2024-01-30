package Java9;

public class HW1 {
    public static void main(String[] args) {

        // Using 2D array create a grocery list.
        // inside you should have an array of veggies, fruits, dairy and sweets.
        // retrieve all value from that array using 2 different loops.

String[][] grocery={
        {"potato","cucumber","tomato","carrot"},
        {"apple","peach","orange","watermelon"},
        {"cheese","milk","egg","yogurt"},
        {"cookie","lollop","chocolate","cake"}
};

for (int i=0;i<grocery.length; i++){  // how many row in all array

    for (int k=0; k<grocery[i].length; k++){        // how many element of each row

        System.out.print(grocery[i][k]+" ");


    }


    System.out.println();

}


        System.out.println(".................");

  for (String [] G:grocery){
      for (String K:G){
          System.out.print(K+ " ");
      }
      System.out.println();
  }

    }
}
