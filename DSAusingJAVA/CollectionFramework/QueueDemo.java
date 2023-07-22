import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        
        Queue<String> line=new ArrayDeque<>();
        line.add("Aman");
        line.add("Aman 1");
        line.add("Aman 3");
        line.add("Aman");
        line.add("Aman");
        line.add("Aman98");

        System.out.println(line);

        
        Deque<String> line2=new ArrayDeque<>();
        line2.add("Aman");
        line2.add("Aman 1");
        line2.add("Aman 3");
        line2.add("Aman");
        line2.add("Aman");
        line2.add("Aman98");

        System.out.println(line2);
        

    }
}
