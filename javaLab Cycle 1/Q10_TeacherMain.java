//Question 10

import java.util.Scanner;

public class Q10_TeacherMain {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter no. of Teachers: ");
        n = input.nextInt();
        Teacher2[] t = new Teacher2[n];

        for(int i=0; i<n; i++){
            System.out.printf("\nEnter Teacher %d details...... ", i+1);
            System.out.print("\nEmployee ID: ");
            String emp_id = input.next();
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Address: ");
            String address = input.next();
            System.out.print("Salary: ");
            float salary = input.nextFloat();
            System.out.print("Department: ");
            String dept = input.next();
            System.out.print("Subject: ");
            String subject = input.next();

            t[i] = new Teacher2(emp_id,name,salary,address,dept,subject);
        }
        for (int j=0; j<n; j++){
            System.out.printf("\nTeacher %d details: ", j+1);
            t[j].display();
            System.out.println("\n.........................");
        }
        input.close();
    }
}


class Employee2{
    String empID;
    String name;
    float salary;
    String address;

    Employee2(String empId, String name, float salary, String address){
        this.empID = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    void display(){
        System.out.printf("\nEmployee ID: %s", empID);
        System.out.printf("\nName: %s", name);
        System.out.printf("\nSalary: %f", salary);
        System.out.printf("\nAddress: %s", address);
    }
}


class Teacher2 extends Employee2{
    String dept;
    String sub;

    Teacher2(String empId, String name, float salary, String address,String dept, String sub){
        super(empId, name, salary, address);
        this.dept = dept;
        this.sub = sub;
    }
    void display(){
        super.display();
        System.out.printf("\nDepartment: %s", dept);
        System.out.printf("\nSubject : %s", sub);
    }
}
