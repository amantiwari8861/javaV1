public class AssertExample {

    public static void main(String[] args) {
        
        int age = -5;
        assert age > 0 : "Age must be positive"; // Assertion with a message
        System.out.println("Age is: " + age);
        // java -ea AssertExample // TODO hello later
    }
}
