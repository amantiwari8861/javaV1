import java.util.Set;
import java.util.HashSet;
import java.util.List;

class HashSetDemo
{
    public static void main(String[] args) {
        
        Set<String> students=new HashSet<>();

        students.add("Aman");
        students.add("Aman 1");
        students.add("Aman 3");
        students.add("Aman");
        students.add("Aman");
        students.add("Aman98");

        // System.out.println(students);
        
        // students.addAll(List.of("Arun","Arun2","Arun"));

        // System.out.println(students);

        // students.forEach(e->{
        //     System.out.println(e);
        // });
        // System.out.println(students);
        // students.removeIf(e -> e.contains(" "));
        // students.remove("Aman");
        Object arr[]=students.toArray();
        // System.out.println(students);

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
        

    }
}
