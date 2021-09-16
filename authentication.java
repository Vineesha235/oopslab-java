import java.io.*;
import java.util.Scanner;


class Authentication
{
String name,pass;
void read()throws UserException
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter usernme: ");
	name = s.nextLine();
	System.out.println("enter password: ");
	pass = s.nextLine();
	if(!name.equals("user") && !pass.equals("user"))throw new UserException();
	else if(name.equals("user") && !pass.equals("user"))throw new UserException();
	else if(!name.equals("user") && pass.equals("user"))throw new UserException();
	else
	{
		System.out.println("Authentication Successful");
	}
}
public static void main(String args[])
{
	Authentication obj1=new Authentication();
	try
	{
		obj1.read();
    }
	catch(UserException u)
	{
		u.show();
	}
}
}

class UserException extends Exception
{
void show()
  {
     System.out.println("Authentication Failed");
  }
}

	