package arithmatic;

public class Substraction implements Arithmetic{

    @Override
    public void calc(int a, int b) {
        System.out.println("Difference = " + (a-b));        
    }
}
