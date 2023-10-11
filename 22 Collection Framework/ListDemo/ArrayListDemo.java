import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        // List<String> names=new ArrayList<>();

        // names.add("Aman");
        // names.add("Krishna");
        // names.add("Dev");
        // names.add("Ram");
        // names.add(2, "Shyam");
        // System.out.println(names);
        // names.remove("Krishna");
        // names.remove(2);
        // System.out.println(names);

        // // for (int i = 0; i < names.size(); i++) 
        // // {
        // //     System.out.println(names.get(i));
        // // }
        // // for (String name : names) 
        // // {
        // //     System.out.println(name);
        // // }

        // // Iterator<String> itr=names.iterator();
        // // while (itr.hasNext()) 
        // // {
        // //     System.out.println(itr.next());
        // // }

        // ListIterator<String> litr=names.listIterator(names.size());
        // while (litr.hasPrevious()) 
        // {
        //     System.out.println(litr.previous());
        // }
        // names.forEach((name)->{
        //     System.out.println(name);
        // });

        // List<String> enemies=List.of("Abhishek","Krishna","Ravi","shivank");

        // // names.addAll(2, enemies);
        // names.addAll(enemies);

        // System.out.println(names);
        // // names.retainAll(enemies);//removes uncommon elements (removes from this list all of its elements that are not contained in the specified collection.)
        // System.out.println(names);
        
        // names.add("1Aman");
        // names.add("aman");
        // names.add("AMAN");
        // Collections.sort(names);
        // System.out.println(names);

        List<Fruit> fruits=new ArrayList<>();

        fruits.add(new Fruit("Mango", "Sweet"));
        fruits.add(new Fruit("Apple", "Sweet"));
        fruits.add(new Fruit("Banana", "Sweet"));

        System.out.println(fruits);
        Collections.sort(fruits,(f1,f2)->f1.getName().compareTo(f2.getName()));

        for (Fruit fruit : fruits) 
        {
            System.out.println(fruit);
        }


    }
}