package Java14;

public class NoteAccessModify {
    public static void main(String[] args) {

       /* Types Of variables:
        There are three types of variables in java
        with respect to scope/visibility/accessibility
        1) local 2) instance 3) static.
        Local Variable:
        Local variables are the variables which are defined inside
        the block of code like if-else statement,loop,switch-statement
        methods. They can only be accessed with-in that block of code.
        when we need to store data temporary and not to planning share with different methods

        {whenever i am writing any logic in a method or loop or if condition and i temporarily need
        to store some data then we should create local var}
        UpSide:
        They occupy the memory for least amount of time inside your computer.
                You should always try to go with local variables.
                DownSide:
        They can only be accessed with-in the same block where they are created.

                Instance Variables:  instance method belong to object
        The variables which are defined inside a class but outside a block of code
                like method,if-else statement,loop,switch etc., are called as instance variables.
        They can be accessed anywhere in the class except static methods.
        {when ever you are planning to reuse a var in more than two methods of your class create an instance var for that}
        when we plan to access var in any class in the same package

                Upside:
        They can be accessed anywhere inside a class other than static methods.
                DownSide:
        They occupy the memory for longer as compared to a local variable.

        static/ global  Variables:   Static method belong to class
        Static variables are created using static keyword they are also created outside of
        blocks of code like methods,loops etc.
        when we plan to access var in any class in any package . information not change frequently
                UpSide:
        we can save a lot of space because for static only one memory location is used
        for all the object.

                Downside:
        It occupies the memory for longest.

                Tasks:
        Create a static method with int return type call it dValue which takes a number as input
        multiples it by 2 and returns the value.

        Access Modifiers:
        Access modifiers in java help us the control who can access what. There are 4 access
        levels and we use three keywords to control these levels. private, default, protected and public.
        Private:
        Is the most restricted one when used with a variable or method those can't be accessed outside of that class.

        Important note:
        1) 99% of the methods are public.
        2) 99% of the instance fields are created as private.
        3) 99% of static fields are public.
        4) 99% of the time class are also public*/

//** private keyword only access in the same class (restricted)
//** default is auto no keyword if i do not put any modify before var or method so i can access any where in any class in the same package
//** public is access with in any class in any package
//** (protect is access in another package extend from the class (inheritance)
//** within all classes in the same package and within subclasses in other packages.  )


    }
}
