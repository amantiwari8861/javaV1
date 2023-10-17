import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDemo 
{
    public static void main(String[] args) {
        
        //due to overriding only queue methods is available
        //FIFO -> first in first out
        // Queue<String> line=new ArrayDeque<>();

        // line.add("krishna");
        // line.add("Raj");
        // line.add("Aakash");
        // line.add("harsh");
        // line.add("Rohit");
        // line.offer("Ravi");
        // line.remove();
        // line.remove("Aakash");
        // System.out.println(line);

        Deque<String> line=new ArrayDeque<>();
        // ArrayDeque<String> line=new ArrayDeque<>();
        
        line.add("krishna");
        line.add("Raj");
        line.add("Aakash");
        line.add("harsh");
        line.add("Rohit");
        line.offer("Ravi");
    
        System.out.println(line);



    }
}
