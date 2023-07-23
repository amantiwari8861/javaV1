import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
    
    TreeMap<String,Object> tm=new TreeMap<>();
    tm.put("Name", "Aman");
    tm.put("DOB", "22/4/1999");
    tm.put("Salary", 50000.89);
    tm.put("Address", "Niit 62 Noida");

    System.out.println(tm);
}
    
}