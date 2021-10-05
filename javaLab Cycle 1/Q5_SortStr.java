//Question No: 5


import java.util.Scanner;

public class Q5_SortStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = input.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the strings: ");
        for(int i=0; i<n; i++){
            str[i] = input.next();
        }
        String temp;
        for(int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Strings in Sorted Order: ");
        for(int i=0; i<n; i++)
            System.out.print(str[i] + ",");
        input.close();
    }
}
