package Java4;

public class ifNested2 {
    public static void main(String[] args) {

        double budget=50000;
        String engineType="Hybrid";


        if (budget>=50000){
            if(engineType.equals("Electric")){
                System.out.println("I want to buy a tesla");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("i want to buy toyota");
                
            }else {
                System.out.println("i want to buy a porche");
            }

            }else if(budget>=30000){
                if(engineType.equals("Electric"))
                {
                    System.out.println("I want to buy BYD");
                }else if(engineType.equals("Hybrid")){
                    System.out.println("I want to buy camry");
                }else {
                    System.out.println("Hyundai Sonata");
                }

            }  else if(budget>=20000){
                if (engineType.equals("Electric")){
                    System.out.println("Nissan leaf");
                }else if(engineType.equals("Hybrid")){
                    System.out.println("KIA");
                }else {
                    System.out.println("Honda Civic");
                }

            }else {
                System.out.println("Lets save more money");
            }












        }


    }

