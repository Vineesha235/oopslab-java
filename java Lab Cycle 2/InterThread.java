public class InterThread {
    public static void main(String[] args) {
        Shared s = new Shared();
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);
    }
}

class Shared {
    int num;
    boolean value = false;

    synchronized int get() {
        if (value == false) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("InteruruptedException!!");
            }
        }
        System.out.println("Consume: " + num);
        value = false;
        notify();
        return num;
    }

    synchronized void put(int num) {
        if (value == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception!!");
            }
        }
        this.num = num;
        System.out.println("Produce: " + num);
        value = true;
        notify();
    }
}

class Producer extends Thread {
    Shared s;

    Producer(Shared s) {
        this.s = s;
        this.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            s.put(++i);
        }
    }
}

class Consumer extends Thread {
    Shared s;

    Consumer(Shared s) {
        this.s = s;
        this.start();
    }

    public void run() {
        while (true) {
            s.get();
        }
    }
}