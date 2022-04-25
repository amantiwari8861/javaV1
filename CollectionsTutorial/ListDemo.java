import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {

        // Create a list of strings
        List<String> list = new ArrayList<String>();

        // Add elements to the list
        list.add("Cat");
        list.add("Armadillo");
        list.add("Eagle");
        list.add("Eagle");
        list.add("Zebra");
        list.add("Bat");
        list.add("Dog");

        // Display the list
        System.out.println("Initial List:");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("\nSorted List:"+list);
        Collections.rotate(list,3);
        System.out.println("\nRotated List:"+list);
        Collections.swap(list,0,3);
        System.out.println("\nSwapped List:"+list);
        Collections.reverse(list);
        System.out.println("\nReversed List:"+list);
        Collections.shuffle(list);
        System.out.println("\nShuffled List:"+list);
        Collections.replaceAll(list,"Eagle","Lion");
        System.out.println("\nReplaced List:"+list);
        Collections.fill(list,"Elephant");
        System.out.println("\nFilled List:"+list);
    }
}