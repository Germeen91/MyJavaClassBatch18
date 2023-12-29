package Java15;

public class person {

    private String name;
    private int age;
    private  double weight;
    private  double salary;
    private  String favPLanguage;

    // constructor have a parameters from fields/ initialize the fields
   public   person(String  pName,int pAge, double pWeight,double pSalary,String pFavPlan){
       name=pName;
       age=pAge;
       weight=pWeight;
       salary=pSalary;         // assigning the parameters to actual fields
       favPLanguage=pFavPlan;
   }

    public   person(String  pName,int pAge, double pWeight,double pSalary){
        name=pName;
        age=pAge;
        weight=pWeight;
        salary=pSalary;         // assigning the parameters to actual fields

    }

   public void printInfo(){

       System.out.println(name+" "+age+" "+weight);
   }


}
