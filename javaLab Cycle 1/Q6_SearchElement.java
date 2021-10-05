//Question No: 6

import java.util.Scanner;

public class Q6_SearchElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.printf("Enter the %d elements: ", n);
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter search element: ");
        int elem = input.nextInt();

        int pos = -1;
        for(int j = 0; j<n; j++){
            if(arr[j] == elem){
                pos  = j;
                break;
            }
        }
        if(pos == -1){
            System.out.print("Element not found!");
        }else{
            System.out.printf("The item is found at position %d", pos+1);
        }
        input.close();
    }
}
