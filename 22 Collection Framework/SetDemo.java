import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        
        //Set is a collection of unique elements
        //Set is an interface and HashSet, LinkedHashSet, TreeSet are implementations of Set

        //Create a HashSet
        Set<String> set = new HashSet<String>();
        //Add elements to HashSet
        set.add("Aman");
        set.add("Ritik");
        set.add("Aman");
        set.add("Ritik");
        set.add("Hemant");

        // //Display the HashSet
        // System.out.println("HashSet: " + set);
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //Create a Set of Employees
        // Set<Employee> empSet = new HashSet<Employee>();
        //Create Employee objects

        
        // empSet.add(new Employee(101, "Aman", "IT", 100000));
        // empSet.add(new Employee(102, "Ritik", "HR", 20000));
        // empSet.add(new Employee(103, "Hemant", "Finance", 30000));
        // empSet.add(new Employee(101, "Aman", "IT", 100000));
        // empSet.add(new Employee(102, "Ritik", "HR", 20000));

        //Display the Set
        // System.out.println("Set: " + empSet);
        
        // for (Employee employee : empSet) {
        //     System.out.println(employee);
        // }
        System.out.println("----------------------------------------------------");
        //Create a LinkedHashSet
        Set<String> set2 = new LinkedHashSet<String>();
        //Add elements to LinkedHashSet
        set2.add("Aman");
        set2.add("Ritik");
        set2.add("Aman");
        set2.add("Ritik");
        set2.add("Hemant");
        
        //Display the LinkedHashSet
        // System.out.println("LinkedHashSet: " + set);
            Iterator itr2 = set2.iterator();
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }
        //Create a TreeSet


    }
}