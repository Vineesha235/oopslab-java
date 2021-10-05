package arithmatic;

public class Division implements Arithmetic {

    @Override
    public void calc(int a, int b) {
        System.out.println("Quotient = " + (a/b));        
    }
}
