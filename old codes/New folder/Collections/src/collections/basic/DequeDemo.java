package collections.basic;
import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;
public class DequeDemo {

	public static void main(String[] args) {

		Deque<String> dq=new ArrayDeque<>();
		
		dq.add("ritik 1 ");
		dq.add("ritik 2 ");
		dq.add("ritik 0 ");
		
		dq.addFirst("avinash");
		dq.addLast("avinash 3");		dq.add("ritik 6 ");
		
 System.out.println(dq.contains("avinash"));
		System.out.println(dq.peek());
		System.out.println(dq.peekLast());
		System.out.println(dq);
		
		Iterator<String> itr=dq.iterator();
		
		while (itr.hasNext()) {
			String string =  itr.next();
			System.out.println(string);
		}
		System.out.println("------------------");
		dq.forEach(e->{System.out.println(e);});
		
		dq.removeLast();
		System.out.println(dq);
		dq.pop();
		System.out.println(dq);
		System.out.println(dq.offer("anjali"));
		System.out.println();
		//convert deque in array
	}

}
