import java.io.*;
import java.util.Scanner;

class ThreadTest
{
	public static void main(String args[])
	{
		Multiple m = new Multiple();
		Prime p = new Prime();
		m.start();
		p.start();
	}
}

class Multiple extends Thread
{
public void run()
{
System.out.println("Multiplcation of 5");
for(int i=0;i<=10;i++)
	{   
		System.out.println(i+ "*5 ="+i*5);
	}
	System.out.println("exit from multiple thread");
}
}

class Prime extends Thread
{
	public void run()
	{
	  int l,f=0,i=2,c=1;
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Prime Numbers");
	  System.out.println("enter limit: ");
	  l=sc.nextInt();
	  while(c<=l)
	    {
			f=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println("prime:"+i);
				c++;
			}
			i++;
		}
		System.out.println("Exit from prime thread");
	  
	}  
}