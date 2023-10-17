import java.util.LinkedList;

public class LinkedListDemo 
{
    public static void main(String[] args) 
    {
        LinkedList<String> myFriends=new LinkedList<String>(); 

        myFriends.add("Arun");
        myFriends.add("Krishna");
        myFriends.add("Shivank");
        myFriends.add("Krishna");
        myFriends.add("Ravi");

        
        System.out.println(myFriends);
        myFriends.offer("Krishna");//Adds the specified element as the tail (last element) of this list.
        
        myFriends.addFirst("harsh");//returns void
        boolean status=myFriends.offerFirst("Mohit");//return boolean

        System.out.println(status);

        myFriends.addLast("harsh");
        myFriends.offerLast("Shubhankar");

        System.out.println(myFriends);
        // myFriends.pollFirst();//returns null if this list is empty.
        // myFriends.removeFirst();//Throws:NoSuchElementException - if this list is empty
        // myFriends.pollLast();
        // myFriends.removeLast();

        // myFriends.removeIf(n->n.equals("harsh"));
        // myFriends.removeIf(n->n.length()>4);
        // myFriends.removeIf(n->n.length()>4 || n.equals("Ravi"));
        // myFriends.removeAll(List.of("Krishna","Shivank","Ravi","Mohit","Raj","Shubhankar"));
        // myFriends.removeLastOccurrence("harsh");
        // myFriends.removeFirstOccurrence("harsh");
        // UnaryOperator<String> operator = n -> n + " - modified";
        // myFriends.replaceAll(operator);

        myFriends.replaceAll(n->{
            if (n.equals("harsh")) 
            {
                return "shivank";
            }
            else
            {
                return n;
            }
        });
        System.out.println(myFriends);
    }
}