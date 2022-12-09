package executors.printtillhundred;

public class NumberPrinter implements Runnable {
    private int numberToPrint;

    NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println("Printing " + this.numberToPrint + ". Printed by thread: " + Thread.currentThread().getName());
    }
}
