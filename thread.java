public class InterThreadCom
{
	public static void main(String args[])
	{
		Shared s=new Shared();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
	}
}
class Shared 
{
int num=0;
boolean val=false;
synchronized int get()
{
	if(val==false)
	  try
	  {
		  wait();
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println("Interrupted Exception caught");
	  }
	 System.out.println("consume: "+num);
	 val=false;
	 notify();
 return num;
}
synchronized int put(int num)
{
	if(val==true)
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception caught");
		}
		this.num=num;
		System.out.println("produce: "+num);
		val=true;
		notify();
		return num;
}
}
class Producer extends Thread
{
	Shared s;
	Producer(Shared s)
	{
		this.s=s;
		this.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			s.put(++i);
		}
	}
}
class Consumer extends Thread
{
	Shared s;
	Consumer(Shared s)
	{
		this.s=s;
		this.start();
	}
	public void run()
	{
		while(true)
		{
			s.get();
		}
	}
}


	