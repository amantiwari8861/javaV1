package hellloworldprinter;

public class HelloWorldPrinter implements Runnable {

    public  void doSomething() {
        System.out.println("Doing something. Printed by: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello World. Printed by: " + Thread.currentThread().getName());
        doSomething();
    }
}
