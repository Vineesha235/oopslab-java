import java.io.*;
import java.util.Scanner;

class RunnableTest
{
	public static void main(String args[])
	{
		new Fibonacci();
		new Even();
	}
}

class Even implements Runnable
{
	Thread thread2=new Thread(this,"Even");
	Even()
	{
		thread2.start();
	}
	public void run()
	{
		int l;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Limit of even numbers: ");
		l=s1.nextInt();
for(int i=0;i<l;i++)
		 {
			if(i%2 == 0)
			{
				System.out.println(i+"");
			}
		 }
		System.out.println("end of thread2");
	}
}
class Fibonacci implements Runnable
{
	Thread thread1=new Thread(this,"Fibonacci");
	Fibonacci()
	{
		thread1.start();
	}
	public void run()
	{
      int a,b,c,lim;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter limit of fibonacci series:");
	  lim=sc.nextInt();
	  a=0;
	  b=1;
	  System.out.println(""+a);
	  System.out.println(""+b);
	  for(int i=2;i<lim;i++)
	  {
		  c=a+b;
		  System.out.println(""+c);
		  a=b;
		  b=c;
	  }
	  System.out.println("end of thread1");
	}
}



		
				
