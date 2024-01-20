package Java17;



// Over Load Methods when we execute same name methods in the same class but diff parameter
//By :
//> change number of parameter
//> change data type
//> change sequence
//why ?to make us reuse the same method by diff ways

// name of method+ parameter (signature)

class MathDemo {

    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2){
        System.out.println(num1+num2);
    }

    static void add(double num1,double num2,double num3){
        System.out.println(num1+num2+num3);
    }
    static void add(double num1,int num2){
        System.out.println(num1+num2);
    }

    static void add(int num1,double num2){
        System.out.println(num1+num2);
    }

}


 class E1MethodOverloading {

        public static void main(String[] args) {
            MathDemo.add(10, 20);
            MathDemo.add(15.5, 25.5);
            MathDemo.add(15.5, 25.5, 25.5);
// static void for static var and do not need create obj  just name of class >> name of var or method


            System.out.println(10);
            System.out.println("name");
            System.out.println(true);


        }

    }


