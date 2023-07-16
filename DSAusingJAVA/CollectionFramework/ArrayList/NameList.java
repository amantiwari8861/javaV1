import java.util.ArrayList;
import java.util.Collections;

public class NameList 
{
    public static void main(String[] args) 
    {
        // ArrayList students=new ArrayList();
        ArrayList<String> students=new ArrayList<>();

        students.add("Aman");
        students.add("Aman 4");
        students.add("Aman 3");
        students.add("Aman 0");
        students.add("aman");
        // students.add(10);
        // students.add(2, 55.8);
        // System.out.println(students);
        // students.remove(3);
        // students.get(4);
        students.clear();
        Collections.sort(students);
        

        System.out.println(students);




    }
}