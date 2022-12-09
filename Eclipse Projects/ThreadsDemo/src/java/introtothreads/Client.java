package introtothreads;

public class Client {

    public static void doSomething() {
        System.out.println("Doing something. Printed by thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello World. Printed by thread: " + Thread.currentThread().getName());
        doSomething();
    }
}
