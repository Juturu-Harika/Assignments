package Assignments.ThreadsAssignment;

class SharedPrinter {
    private boolean isOdd = true;

    public synchronized void printOdd(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
        isOdd = false;
        notify();
    }

    public synchronized void printEven(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
        isOdd = true;
        notify();
    }
}

class OddThread extends Thread {
    private SharedPrinter printer;
    private int max;

    public OddThread(SharedPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 1; i <= max; i += 2) {
            printer.printOdd(i);
        }
    }
}

class EvenThread extends Thread {
    private SharedPrinter printer;
    private int max;

    public EvenThread(SharedPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 2; i <= max; i += 2) {
            printer.printEven(i);
        }
    }
}

public class OddEvenPrinters {
    public static void main(String[] args) {
        int max = 10; // Set the range
        SharedPrinter printer = new SharedPrinter();

        Thread oddThread = new OddThread(printer, max);
        Thread evenThread = new EvenThread(printer, max);

        oddThread.start();
        evenThread.start();
    }
}
