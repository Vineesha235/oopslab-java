//Question 11
import java.util.Scanner;

public class Q11_PersonMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, gender, address, com_name, qua, subject, dept;
        int age, emp_id, tecID;
        float salary;

        System.out.print("Enter no of teachers: ");
        int n = input.nextInt();
        Teacher[] t = new Teacher[n];
        for (int i=0; i<n; i++){
            System.out.print("\nEnter Teacher "+(i+1)+" Details............ ");
            System.out.print("\nName: ");
            name = input.next();
            System.out.print("Gender: ");
            gender = input.next();
            System.out.print("Age: ");
            age = input.nextInt();
            System.out.print("Address: ");
            address = input.next();
            System.out.print("Employee ID: ");
            emp_id = input.nextInt();
            System.out.print("Company Name: ");
            com_name = input.next();
            System.out.print("Qualification: ");
            qua = input.next();
            System.out.print("Salary: ");
            salary = input.nextFloat();
            System.out.print("Subject: ");
            subject = input.next();
            System.out.print("Department: ");
            dept = input.next();
            System.out.print("TeacherID: ");
            tecID =input.nextInt();

            t[i] = new Teacher(name,gender,address,age,emp_id,com_name,qua,salary,subject,dept,tecID);
        }

        for(int j=0; j<n; j++){
            System.out.printf("\nTeacher %d Details: ", j+1);
            t[j].display();
            System.out.println("\n.......................");
        }
        input.close();
    }
}


class Person{
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String add, int age){
    this.name = name;
    this.gender = gender;
    this.address = add;
    this.age = age;
    }

    void display(){
        System.out.printf("\nPerson Name: %s", this.name);
        System.out.printf("\nGender: %s", this.gender);
        System.out.printf("\nAddress: %s", this.address);
        System.out.printf("\nAge: %s", this.age);
    }
}


class Employee1 extends Person{
    int empId;
    String comName;
    String qua;
    float sal;

    Employee1(String name,String gender,String add,int age,int ID,String comName,String qua,float sal){
        super(name, gender, add, age);
        this.empId = ID;
        this.comName = comName;
        this.sal = sal;
        this.qua = qua;
    }

    void display(){
        super.display();
        System.out.printf("\nEmployee ID: %d", empId);
        System.out.printf("\nCompany Name: %s", comName);
        System.out.printf("\nQualification: %s", qua);
        System.out.printf("\nSalary: %f", sal);
    }
}


class Teacher extends Employee1{
    String sub;
    String dep;
    int tecId;

    Teacher(String name,String gender,String add,int age,int empId,String comName,String qua,float sal,String sub,
            String dep,int tecId){
        super(name,gender,add,age,empId,comName,qua,sal);
        this.sub = sub;
        this.dep = dep;
        this.tecId = tecId;
    }

    void display(){
        super.display();
        System.out.printf("\nSubject: %s", sub);
        System.out.printf("\nDepartment: %s", dep);
        System.out.printf("\nTeacher ID: %d", tecId);
    }
}
