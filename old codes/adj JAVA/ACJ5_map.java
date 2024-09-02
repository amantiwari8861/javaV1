

//what is map in java?
// map in java is contains values on basis of key.
// map contains is unique keys
// map is useful when we search, update/delete elements on basis of key.

// map=dictionay


import java.util.*;
public class ACJ5_map {

    public static void main(String[] args)
    {
        Map m1=new HashMap();
        m1.put(1, "this");
        m1.put(2, "is");
        m1.put(3, "map");
        m1.put(4, "value");
        
        Set s1=m1.entrySet();
        Iterator itr=s1.iterator();

        while(itr.hasNext())
        {
            Map.Entry e1=(Map.Entry)itr.next();
            System.out.println(e1.getKey()+" "+e1.getValue());  
        }

    }
}