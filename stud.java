import java.util.Scanner;
class student
{
 
 String name;
 int age;
 String place;
 String co;
 int m1,m2,m3;
 Scanner sc=new Scanner(System.in);
 void read()
 {
  System.out.println("Enter the name:");
  name=sc.nextLine();
  System.out.println("Enter the Age:");
  age=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter the course:");
  co=sc.nextLine();
  System.out.println("Enter the place:");
  place=sc.nextLine();
 }
 void totel()
 {
  int totel=0;
  System.out.println("Enter the 3 subject mark:");
  m1=sc.nextInt();
  m2=sc.nextInt();
  m3=sc.nextInt();
  totel=m1+m2+m3;
  System.out.println("the totel mark of the student  is:"+totel);
 }
 void display()
 {
   
  System.out.println("the name is:"+name);
  System.out.println("the Age is:"+age);
  System.out.println("the Place is:"+place);
  System.out.println("the Course is:"+co);
  
}
}
class stud
{
 public static void main(String arg[])
  {
   student st=new student();
   st.read();
   st.totel();
   st.display();
  }
}