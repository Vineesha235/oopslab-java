//Question No: 09

public class Q9_OverloadMain {
    public static void main(String[] args) {
        Overload ov = new Overload();
        ov.calculate(10 ,'s' );
        ov.calculate(10 ,45, 'p' );
        ov.calculate("Hello", "World");
    }
}


class Overload{

    void calculate(int n, char ch){
        if(ch == 's')
            System.out.printf("\nSquare of %d is %d", n, (n*n));
        else
            System.out.printf("\nCube of %d is %d", n, (n*n*n));
    }
    void calculate(int n, int m, char ch){
        if(ch =='p')
            System.out.printf("\nProduct : %d", (n*m));
        else
            System.out.printf("\nSum: %d", (n+m));
    }
    void calculate(String str1, String str2){
        if(str1.equals(str2))
            System.out.printf("\n'%s' and '%s' are equal.", str1, str2);
        else
            System.out.printf("\n'%s' and '%s' are not equal.", str1, str2);
    }
}
