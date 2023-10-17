import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo 
{
    public static void main(String[] args) {
        
        Map<String,Object> aadharCard=new HashMap<>();

        aadharCard.put("name", "Aman Tiwari");
        aadharCard.put("age", 24);
        aadharCard.put("aadhar no",12345667889L);
        aadharCard.put("name", "Harsh Tiwari");


        System.out.println(aadharCard);

        for (Entry<String,Object> entry :aadharCard.entrySet()) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
