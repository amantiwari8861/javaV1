import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) 
    {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        // hashtable.put(3, null); // NullPointerException since null values are not allowed

        System.out.println(hashtable);

        Map<String,Object> aadharCard=new HashMap<>();
        aadharCard.put("name", "Aman");
        aadharCard.put("aadharNo", 452352367L);
        aadharCard.put("Salary",200000.0);
        aadharCard.put("Address", "Mithaas PG");
        // aadharCard.put("name", "kashvi");

        // System.out.println(aadharCard);

        // System.out.println(aadharCard.get("name"));
        // System.out.println(aadharCard.keySet());
        // System.out.println(aadharCard.values());
        // System.out.println(aadharCard.entrySet());

        Set<Entry<String,Object>> entries=aadharCard.entrySet();

        for (Entry<String,Object> entry : entries) 
        {
            // System.out.println(entry);
            System.out.print(entry.getKey()+" : ");
            System.out.println(entry.getValue());
        }
    }
}