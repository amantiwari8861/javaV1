import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
public static void main(String[] args) {
 
    LinkedHashMap<String,Object> lhm=new LinkedHashMap<>();
    lhm.put("Name", "Aman");
    lhm.put("DOB", "22/4/1999");
    lhm.put("Salary", 50000.89);
    lhm.put("Address", "Niit 62 Noida");

    System.out.println(lhm);
}
    
}