import java.util.Scanner;
class searchElements
{
 public static void main(String arg[])
 {
   int i,n,m,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number of elements in an array:");
  n = sc.nextInt();
  int a[]=new int[n];
  System.out.println("enter the array elements");
  for(i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
   }
  System.out.println("Enter the number to search:");
  m=sc.nextInt();
  for(i=0;i<n;i++)
  {
   if(a[i]== m)
     {
       flag=1;
       break;
     }
  } 
  if(flag==1)
   System.out.println("The element found in the position:"+(i+1));
  else
    System.out.println("The element is not found :");
 }
}