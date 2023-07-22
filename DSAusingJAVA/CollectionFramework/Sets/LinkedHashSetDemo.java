import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        Set<String> students=new LinkedHashSet<>();
        students.add("Aman");
        students.add("Aman 1");
        students.add("Aman 3");
        students.add("Aman");
        students.add("Aman");
        students.add("Aman98");

        System.out.println(students);
    }
}
