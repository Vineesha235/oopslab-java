import java.util.Scanner;
class symmetric
{
  public static void main(String arg[])
  {
   int f=0;
   int a[][] = new int[10][10];
   int temp[][] = new int[10][10];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of row :");
  int r=sc.nextInt();
  System.out.println("enter the number of column:");
  int c=sc.nextInt();
  System.out.println("enter the elements");
  for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
      a[i][j]=sc.nextInt();
     }
    }
   System.out.println("Print the  metrix:");
  for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
      System.out.print(a[i][j]+" ");
     }
    System.out.println();
    }
 
  for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
      temp[j][i]=a[i][j];
     }
    }
    System.out.println("After interchanging the rows and colunms");
    for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
     System.out.print(temp[i][j]+" ");
     }
     System.out.println();
    }

    for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
      if(temp[i][j]!=a[i][j])
        f=1;
        break;
         
     }
    }
    if(f==1)
      System.out.println("It is a not symmetric metricx");
    else
        System.out.println("It is  a symmetric metricx");
    
  }
}