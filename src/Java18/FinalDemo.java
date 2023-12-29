package Java18;

//if we put final keyword before any method no other class can override that method
// if use final before name of class means can not inheritance classes of this class
//if use final before var cannot reassign a value to final var
public class FinalDemo {
   final String greetings="Hello Everyone";
   void test(){   // cannot assign a value to final var

       //greetings="Hello guys";  >>> error
   }
}
