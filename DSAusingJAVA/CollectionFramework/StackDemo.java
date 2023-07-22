import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack<String> students=new Stack<>();
        students.add("Aman");
        students.add("Aman 1");
        students.add("Aman 3");
        students.add("Aman");
        students.add("Aman");
        students.add("Aman98");
        students.add("Naman");
        students.add("Kashvi");
        students.add("Arun");

        students.add(3, "DEV");
        System.out.println(students);


    }
}
