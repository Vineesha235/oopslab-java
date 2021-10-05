//Question No: 7

import java.util.Scanner;

public class Q7_StrManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter 1st string: ");
        String s1 = input.next();
        System.out.print("Enter 2nd string: ");
        String s2 = input.next();

        if(s1.equals(s2))
            System.out.printf("\nThe strings '%s' and '%s' are equal", s1, s2);
        else
            System.out.printf("\nThe strings '%s' and '%s' are not equal", s1, s2);
        System.out.printf("\nThe joined string is '%s'", s1.concat(s2));
        System.out.printf("\nThe second character of '%s' is '%c'", s1, s1.charAt(1));

        input.close();
    }
}
