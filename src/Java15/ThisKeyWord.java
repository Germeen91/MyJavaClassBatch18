package Java15;

public class ThisKeyWord {
        private String name;
        private  String address;

        private int age;
        private double weight;



        public ThisKeyWord(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public ThisKeyWord(String name, String address, int age, double weight) {
            this(name, address, age);
            this.weight = weight;
        }





        void printInfo(){
            System.out.println(name+" "+address);
        }
    }

