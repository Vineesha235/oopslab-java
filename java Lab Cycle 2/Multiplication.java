package arithmatic;

public class Multiplication implements Arithmetic {

    @Override
    public void calc(int a, int b) {
        System.out.println("Product = " + (a*b));        
    }
    
}
