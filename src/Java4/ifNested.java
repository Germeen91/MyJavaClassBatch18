package Java4;

public class ifNested {
    public static void main(String[] args) {

boolean isMaindoorOPened=true;

boolean isRoom1OPened=false;
boolean isRoom2Opened=true;

if (isMaindoorOPened){

    if(isRoom1OPened){
        System.out.println("we are in Room 1");
    }else{
        System.out.println("Room 1 is closed"); // double shift-plugins-rainbow brackets-install-indent rainbow-restart IED(chang color)
    }
                                             //double click on the any bracket to see the condation
    if (isRoom2Opened) {
        System.out.println("we are in Room 2");
    }else {
        System.out.println("Room 2 is closed");
    }


        }else {
    System.out.println("Cant enter the house main door is closed");
}





    }
}
