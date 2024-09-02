

// what is hashtable in java?
// java hashtable is class implements 
// which maps keys to values 
// hashtable inherit class and implements map interface




// import java.util.*;
// /**
//  * ACJ7_Hashtable
//  */
// public class ACJ7_Hashtable {

//     public static void main(String[] args)
//     {
//         Hashtable<Integer,String> ht1=new Hashtable<Integer, String>();
        
//         ht1.put(1, "Apple");
//         ht1.put(2, "Banana");
//         ht1.put(3, "Cherry");
//         ht1.put(4, "Date");
        
//         System.out.println(ht1);

//     }
// }










// import java.util.*;
// /**
//  * ACJ7_Hashtable
//  */
// public class ACJ7_Hashtable {

//     public static void main(String[] args)
//     {
//         Hashtable<Integer,String> ht1=new Hashtable<Integer, String>();
//         Hashtable<Integer,String> ht2=new Hashtable<Integer, String>();
        
//         ht1.put(1, "Apple");
//         ht1.put(2, "Banana");
//         ht1.put(3, "Cherry");
//         ht1.put(4, "Date");
        
//         System.out.println(ht1);
//         ht2=(Hashtable<Integer,String>)ht1.clone();
//         System.out.println(ht2);

//     }
// }









import java.util.*;
/**
 * ACJ7_Hashtable
 */
public class ACJ7_Hashtable {

    public static void main(String[] args)
    {
        Hashtable<Integer,String> ht1=new Hashtable<Integer, String>();
        Hashtable<Integer,String> ht2=new Hashtable<Integer, String>();
        
        ht1.put(1, "Apple");
        ht1.put(2, "Banana");
        ht1.put(3, "Cherry");
        ht1.put(4, "Date");
        
        System.out.println(ht1);
        ht2=(Hashtable<Integer,String>)ht1.clone();
        System.out.println(ht2);

        ht1.clear();
        System.out.println(ht1);
    }
}