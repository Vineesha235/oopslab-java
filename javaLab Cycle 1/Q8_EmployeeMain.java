//Question No: 8

import java.util.Scanner;

public class Q8_EmployeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no of Employees: ");
        int n = input.nextInt();
        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.printf("\nEnter Employee %d details: ", (i+1));
            emp[i].read();
        }

        System.out.print("\nEnter Employee Number to Search: ");
        int num = input.nextInt();

        int searchNum = -1;
        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == num) {
                searchNum = i;
                break;
            }
        }
        if (searchNum == -1) {
            System.out.printf("\nEmployee with number %d Not Found!", num);
        } else {
            emp[searchNum].display();
        }
        input.close();
    }
}

class Employee {
    int eNo;
    String eName;
    float eSalary;
    Scanner input = new Scanner(System.in);

    void read() {
        System.out.print("\nEmployee No: ");
        this.eNo = input.nextInt();
        System.out.print("Employee Name: ");
        this.eName = input.next();
        System.out.print("Employee Salary: ");
        this.eSalary = input.nextFloat();
    }

    void display() {
        System.out.printf("\nEmployee No: %d", this.eNo);
        System.out.printf("\nEmployee Name: %s", this.eName);
        System.out.printf("\nEmployee Salary: %.2f", this.eSalary);
    }
}
