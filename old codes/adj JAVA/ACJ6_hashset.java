

// what is HashSet in java?
// hashset is a collection of values/items.
// hashset have unique values/items.
// hashset is a part or package from java.util.
// hashset have unindex and random values/items.






import java.util.HashSet;
public class ACJ6_hashset
{
    public static void main(String[] args)
    {
        HashSet<String> hs1=new HashSet<String>();
        hs1.add("apple");//add item in hash set
        hs1.add("banana");//add item in hash set
        hs1.add("cherry");//add item in hash set
        hs1.add("date");//add item in hash set
        System.out.println(hs1);            

        System.out.println(hs1.contains("mango"));//f
        System.out.println(hs1.contains("apple"));//t
        
        hs1.add("mango");//add item in hash set
        System.out.println(hs1);

        System.out.println("total item in hashset "+hs1.size());//total number of item in hashset

        for (String s : hs1)
        {   System.out.println("hashset value is "+s);  }

        hs1.remove("mango");//remove one item from hash set
        System.out.println(hs1);
        
        hs1.clear();//clear all item from hash set
        System.out.println(hs1);
        
    }
}














// import java.util.*;

// public class ACJ6_hashset 
// {
//     public static void main(String[] args) 
//     {
//         HashSet<Integer> hs1=new HashSet<Integer>();
//         hs1.add(9);
//         hs1.add(7);
//         hs1.add(5);
//         hs1.add(3);
//         hs1.add(1);

//         for(int i=1;i<=10;i++)
//         {
//             if(hs1.contains(i))
//             {   System.out.println(i + "is in hashset");   }
//             else
//             {   System.out.println(i+ "is not in hashset");   }
//         }
//     }
// }