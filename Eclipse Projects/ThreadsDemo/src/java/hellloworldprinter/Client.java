package hellloworldprinter;

public class Client {

    public static void main(String[] args) {
        System.out.println("Hello World. Printed by: " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();

//        helloWorldPrinter.run();
        System.out.println("Before I end. Printed by: " + Thread.currentThread().getName());
    }
}
