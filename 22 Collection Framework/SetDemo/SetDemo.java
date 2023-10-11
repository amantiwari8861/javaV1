import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        
        // Set<String> friends=new HashSet<>();
        // Set<String> friends=new LinkedHashSet<>();
        Set<String> friends=new TreeSet<>();
        friends.add("Krishna");
        friends.add("Krishna");
        friends.add("Krishna");
        friends.add("Aman");
        friends.add("Shivank");
        friends.add("Ravi");
        friends.add("harsh");

        System.out.println(friends);
    }
}