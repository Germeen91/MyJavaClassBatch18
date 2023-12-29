package review8;

public class sport {  // class is template , BluePrint

    // Variable  >>>  data type + name
    // instance Var
    String type,teamName;

    int numberOfPlayers;
    String location;
    String coach;
// Static Var
    static boolean fun;

    sport(String type ,String teamName){  // no need to put static Var
        this.type=type;
        this.teamName=teamName;
    }

     sport(String type, String teamName, int numberOfPlayers, String location, String coach) {
       this(type,teamName);  // used to refer this class constructor
        this.numberOfPlayers = numberOfPlayers;
        this.location = location;
        this.coach = coach;
    }

    // // Methods     >> return type + name (){}

    void play (){
        System.out.println("we play "+type );
    }

    void watch(String stream){
        System.out.println();
    }
}
class stadium{
    public static void main(String[] args) {

        sport s=new sport("soccer","man city");
        System.out.println(s.type+" and team name is "+ s.teamName);
        System.out.println(s.numberOfPlayers);   // we will get 0 because it initialized in constructor java created

new sport("BasketBall","Chicago bulls",15,"Chicago","Billy ");

    }
}
