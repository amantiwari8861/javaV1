
// what is set in java?
// set is a collection that cannot duplicate elements
// set is just like abstraction 
// set come always random 
// set can't be index




import java.util.*;
import java.util.Collection.*;
/**
 * ACJ3_set
 */
public class ACJ3_set
{
    public static void main(String[] args)
    {
        Set<String> s1= new HashSet<String>();
        s1.add("this");
        s1.add("is");
        s1.add("first");
        s1.add("set");
        s1.add("in");
        s1.add("java");
        
        System.out.println(s1);        
    }
    
}