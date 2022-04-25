import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
        
        //Creating a Pet Store
        //Map interface is not a child of Collection interface
        Map<String,Integer> petStore = new HashMap<String,Integer>();
        petStore.put("Cat",500);
        petStore.put("Dog",1000);
        petStore.put("Bird",200);
        petStore.put("Fish",300);
        petStore.put("Rabbit",400);
        petStore.put("Snake",600);
        petStore.put("Tiger",700);

        //Display the Pet Store
        // System.out.println("Initial Pet Store:");
        // System.out.println(petStore);

        // petStore.forEach((k,v)->System.out.println(k+" "+v));

        // for (Object object : petStore.entrySet()) {
        //     Map.Entry pair = (Map.Entry)object;
        //     System.out.println(pair.getKey()+" "+pair.getValue());
        // }
        // Set<Entry<String,Integer>> rows=petStore.entrySet();
        // rows.forEach(row->System.out.println(row.getKey()+" "+row.getValue()));

        // for (Entry<String,Integer> row:rows) {
        //     System.out.println(row.getKey()+" "+row.getValue());
        // }
        // System.out.println(petStore);
        // Map.Entry<String,Integer> row=petStore.entrySet().iterator().next();
        // System.out.println(row.getKey()+" "+row.getValue());
        Iterator<Entry<String,Integer>> it=petStore.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> row=(Entry<String,Integer>)it.next();
            System.out.println(row.getKey()+" "+row.getValue());
        }

    }
}