import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Limit: ");
		int n = input.nextInt();

		Prime prime = new Prime(n);
		Five five = new Five();

		prime.start();
		five.start();

		input.close();
	}
}

class Five extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x 5 = " + (i * 5));
		}
		System.out.println("Exit from Five Thread.");
	}
}

class Prime extends Thread {
	int n, count = 1, temp = 2, flag = 0;

	Prime(int n) {
		this.n = n;
	}

	public void run() {
		while (count <= n) {
			flag = 0;
			for (int i = 2; i <= temp / 2; i++) {
				if (temp % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Prime " + count + ": " + temp);
				count++;
			}
			temp++;
		}
		System.out.println("Exit from Prime thread.");
	}
}
