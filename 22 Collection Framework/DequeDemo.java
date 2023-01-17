import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
class DequeDemo
{
    public static void main(String[] args) {
        
        /* Queue<String> queue = new LinkedList<String>();
        queue.add("Aman");
        queue.add("Bharat");
        System.out.println("deleted the "+queue.poll()+" element");
        System.out.println("Queue: " + queue);
        queue.add("Bhaskar");
        queue.add("Chandu");
        System.out.println("Queue: " + queue);
        System.out.println("1st element :"+queue.peek());
        System.out.println(queue.element());
        queue.clear();
        // System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println("Queue: " + queue);
         */
        // Deque<String> deque = new LinkedList<String>();
        // deque.add("Aman");
        // deque.add("Aman2");
        // deque.pop();//removes the first element
        // deque.push("Aman3");//adds first
        // System.out.println("deque: " + deque);
/* 
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Aman");
        deque.add("Aman2");
        deque.offer("emans");
        deque.addFirst("ritika");
        deque.addLast("ritika2");
        deque.removeFirst();
        deque.removeLast();
        System.out.println("deque: " + deque); */

        Queue<Integer> queue1=new PriorityQueue<>();
        queue1.add(10);
        queue1.add(2);
        queue1.add(30);
        queue1.add(4);
        queue1.add(5);
        queue1.add(60);
        queue1.add(7);
        System.out.println(queue1);


    }
}