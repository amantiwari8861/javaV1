import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) 
    {
        // List students=new ArrayList(); 
        // students.add("Kashvi");
        // students.add("Aman");
        // students.add("Dev");
        // students.add("Raj");
        // students.add(10);
        // students.add(50.6f);

        // for (int i = 0; i < students.size(); i++) 
        // {
        //     System.out.println(students.get(i)+" : "+students.get(i).getClass());
        // }

        
        // List<String> students=new ArrayList<String>(); 
        List<String> students=new ArrayList<>(); 
        students.add("Kashvi");
        students.add("Aman");
        students.add("Dev");
        students.add("Raj");
        // students.add(10);
        // students.add(50.6f);

        // for (int i = 0; i < students.size(); i++) 
        // {
        //     System.out.println(students.get(i)+" : "+students.get(i).getClass());
        // }
        // for (String e : students) 
        // {
        //     System.out.println(e);
        // }
        // students.forEach(e->System.out.println(e));
        students.forEach(System.out::println);
        System.out.println(students);
    }
}
