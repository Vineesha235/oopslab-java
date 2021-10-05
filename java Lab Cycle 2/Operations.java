import java.util.Scanner;

import arithmatic.*;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b:");
        int b = input.nextInt();

        Addition add = new Addition();
        Substraction sub = new Substraction();
        Division div = new Division();
        Multiplication mul = new Multiplication();

        add.calc(a, b);
        sub.calc(a, b);
        div.calc(a, b);
        mul.calc(a, b);
        input.close();
    }
}
