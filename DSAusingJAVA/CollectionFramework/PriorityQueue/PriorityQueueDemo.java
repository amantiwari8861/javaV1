import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
    public static void main(String[] args) {
        
        // PriorityQueue<Integer> numbers=new PriorityQueue<>();
        PriorityQueue<Integer> numbers=new PriorityQueue<>(new DescendingSort());
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(50);
        numbers.add(60);

        //Priority Queue is generally follows ascending order
        // System.out.println(numbers);//it doesn't guarranty the order as ascending

        // Iterator<Integer> itr=numbers.iterator();
        // while (itr.hasNext())//it doesn't guarranty the order as ascending
        // {
        //     System.out.println(itr.next());    
        // }
        
        PriorityQueue<Integer> p1=new PriorityQueue<>();
        numbers.forEach((e)->p1.add(e));
        
        while (numbers.peek()!=null) 
        {
            System.out.println(numbers.poll());
        }
        System.out.println(numbers);
        System.out.println(p1);
    }
}
class DescendingSort implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) 
    {
        if(o1>o2)
            return -1;
        else if(o1<o2)
            return 1;
        else 
            return 0;
    }    
}