//Question No: 1

import java.util.Scanner;

public class Q1_ProductMain {
    public static void main(String[] args) {

        Product[] p = new Product[3];

        for (int i = 0; i < 3; i++) {
            p[i] = new Product();
            p[i].read();
        }

        if (p[0].price < p[1].price && p[0].price < p[2].price) {
            System.out.print("\n" + p[0].pName + " has the lowest price.");
            p[0].display();
        } else if (p[1].price < p[2].price) {
            System.out.print("\n" + p[1].pName + " has the lowest price.");
            p[1].display();
        } else {
            System.out.print("\n" + p[2].pName + " has the lowest price.");
            p[2].display();
        }
    }
}

class Product {
    int pCode;
    String pName;
    float price;
    Scanner input = new Scanner(System.in);

    void read() {
        System.out.print("\nProduct Code: ");
        pCode = input.nextInt();
        System.out.print("Product Name: ");
        pName = input.next();
        System.out.print("Product Price: ");
        price = input.nextFloat();
    }

    void display() {
        System.out.println("\nProduct Code: " + pCode);
        System.out.println("Product Name: " + pName);
        System.out.println("Product Price: " + price);

    }
}