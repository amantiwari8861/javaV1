import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) 
    {
        Stack<String> books=new Stack<>();
        books.push("C");
        books.push("C++");
        books.push("Java");
        System.out.println(books);
        books.pop();
        System.out.println(books);
        System.out.println(books.peek());
        System.out.println(books.isEmpty());
        System.out.println();
    }
}