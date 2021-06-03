import java.io.*;
import java.util.Scanner;
class ComplexNum 
{
    int real;
    int imaginary;
    void read()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Real Part :");
        real=s.nextInt();
        System.out.println("Enter the Imaginary Part :");
        imaginary=s.nextInt();
        
    }
    void display()
    {
        System.out.println(real + "+" + imaginary + "i");
    }
    ComplexNum addComplexNum (ComplexNum C)
    {
        ComplexNum D =new ComplexNum();
        D.real=real + C.real;
        D.imaginary=imaginary + C.imaginary;
        return(D);

    }
    
}
class ComplexDemo
{
    public static void main(String[] args) 
    {
        ComplexNum c1 = new ComplexNum();
        ComplexNum c2 = new ComplexNum();
        ComplexNum c3 = new ComplexNum();
        c1.read();
        c2.read();
        c1.display();
        c2.display();
        c3 = c1.addComplexNum(c2);
    }
}

