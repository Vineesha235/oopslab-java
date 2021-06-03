import java.util.Scanner;
class SalesMan
{ 
  String sname;
  String scode;
  int samount;
  double commission;
  void readData()
  { 
    Scanner dp=new Scanner(System.in);
    System.out.println("name:");
    sname=dp.nextLine();
    System.out.println("scode:");
    scode=dp.nextLine();
    System.out.println("Amount:");
    samount=dp.nextInt();
  }
  void calculateCommission()
  {
    if (samount < 2000)
     commission=0.08* samount;
    else if (samount<=5000)
      commission=0.10 * samount;
    else if(samount> 5000)
      commission=.12* samount;
  }
 void display()
 {
   System.out.println("Salesman Name:"+ sname);
   System.out.println("Sales Amount:"+samount);
   System.out.println("Commission:"+commission);
 }
}
class salesMans
{
 public static void main(String args[])
 {
  SalesMan s1=new SalesMan();
  s1.readData();
  s1.calculateCommission();
  s1.display();
 }
}