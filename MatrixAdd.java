import java.io.*;
import java.util.Scanner;
public class MatrixAdd 
{
    public static void main(String[] args) 
    { 
        int p,q,m,n;
        int a[][];
        int b[][];
        int c[][];
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the elements in first row");
        p=s.nextInt();
        System.out.print("Enter the elements in first coloumn");
        q=s.nextInt();
        System.out.print("Enter the elements in second row");
        m=s.nextInt();
        System.out.print("Enter the elements in secomnd coloumn");
        n=s.nextInt();
        if(p==q && m==n)
        {
            a=new int[p][q];
            b=new int[m][n];
            c=new int[m][n];
            System.out.print("Enter all the elements of first matrix");
            for(i=0;i<p;i++)
            for(j=0;j<q;j++)
            {
                a[i][j]=s.nextInt();
            }
            System.out.print("Enter all the elements of second matrix");
            for(i=0;i<m;i++)
            for(j=0;j<n;j++)
            {
                b[i][j]=s.nextInt();
            }
            System.out.print("First Matrix:");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            }
            System.out.print("Second Matrix:");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();

            }
            for(i=0;i<p;i++)
            for(j=0;j<q;j++)
            {
                c[i][j] = a[i][j] + 
                b[i][j];
            }
            System.out.println("Sum of Matrix :");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }

        }

        
    }
    
}
