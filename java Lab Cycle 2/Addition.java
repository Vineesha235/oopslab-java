package arithmatic;

public class Addition implements Arithmetic{

    @Override
    public void calc(int a, int b) {
        System.out.println("Sum = " + (a+b));
    }
}
