import java.util.Scanner;

public class salesManMain {
    public static void main(String[] args) {
        SalesMan s1 = new SalesMan();
        s1.readData();
        s1.calculateCommission();
        s1.display();
    }
}

class SalesMan {
    String name;
    String code;
    int amount;
    double commission;

    void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nName:");
        name = input.nextLine();
        System.out.print("Code:");
        code = input.nextLine();
        System.out.print("Amount:");
        amount = input.nextInt();
        input.close();
    }

    void calculateCommission() {
        if (amount < 2000)
            commission = 0.08 * amount;
        else if (amount <= 5000)
            commission = 0.10 * amount;
        else
            commission = 0.12 * amount;
    }

    void display() {
        System.out.println("\nSalesman Name:" + name);
        System.out.println("Sales Amount:" + amount);
        System.out.println("Commission:" + commission);
    }
}
