public class Q6 {
    public static void main(String[] args) {

        System.out.print("Enter the value of n: ");
        int n = Integer.parseInt(System.console().readLine());

        new Fibonacci(n);
        new Even(n);

    }
}

class Fibonacci implements Runnable {

    int n;
    Thread t1 = new Thread(this, "Fibonacci");

    Fibonacci(int n) {
        this.n = n;
        t1.start();
    }

    @Override
    public void run() {
        int a = 0, b = 1, c;
        if (this.n == 1)
            System.out.println("Fibonacci 1 : 0");
        else if (this.n == 2) {
            System.out.println("Fibonacci 1 : 0");
            System.out.println("Fibonacci 2 : 1");
        } else {
            System.out.println("Fibonacci 1 : 0");
            System.out.println("Fibonacci 2 : 1");
            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.println("Fibonacci " + i + " : " + c);
                a = b;
                b = c;
            }
        }
        System.out.println(" Exit from Fibonacci Thread");

    }
}

class Even implements Runnable {

    int n;
    Thread t2 = new Thread(this, "Even");

    Even(int n) {
        this.n = n;
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println("Even Number : " + i);
        }
        System.out.println(" Exit from Even Thread");
    }
}