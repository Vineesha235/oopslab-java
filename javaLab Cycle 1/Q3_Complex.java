//Question No: 3

import java.util.Scanner;

public class Q3_Complex {
    public static void main(String[] args) {
        ComplexNo c1, c2, c3;
        c1 = new ComplexNo();
        c2 = new ComplexNo();

        c1.read();
        c2.read();
        System.out.print("Number 1: ");
        c1.display();
        System.out.print("Number 2: ");
        c2.display();
        System.out.print("Sum: ");
        c3 = c1.add(c2);
        c3.display();
    }
}

class ComplexNo {
    int real;
    int imaginary;
    Scanner input = new Scanner(System.in);

    void read() {
        System.out.print("Enter the Real part: ");
        real = input.nextInt();
        System.out.print("Imaginary part: ");
        imaginary = input.nextInt();
    }

    void display() {
        System.out.println(real + "+" + imaginary + "i");
    }

    ComplexNo add(ComplexNo n) {
        ComplexNo num = new ComplexNo();
        num.real = this.real + n.real;
        num.imaginary = this.imaginary + n.imaginary;
        return num;
    }
}