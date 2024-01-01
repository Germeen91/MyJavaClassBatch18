package Java22InterFaces;

public interface Calculator {
    int add(int n1,int n2);

    int subtract(int n1,int n2);
}
class Math implements Calculator{

    @Override
    public int add(int n1,int n2){
        return n1+n2;
    }

    @Override
    public int subtract(int n1,int n2){
        return n1-n2;
    }
}
