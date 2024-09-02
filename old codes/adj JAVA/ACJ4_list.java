
// what is list in java?
// list in java is way of store ordered values/collection.
// in list we can add object /collection which can be duplicate stored.
// list can be indexd.





// import java.util.*;
// /**
//  * ACJ4_list
//  */
// public class ACJ4_list {

//     public static void main(String[] args)
//     {
//         List<Integer> l1= new ArrayList<Integer>();
//         l1.add(0,1);
//         l1.add(1,2);
//         l1.add(2,3);
//         System.out.println(l1);
//     }
// }










// import java.util.*;
// /**
//  * ACJ4_list
//  */
// public class ACJ4_list {

//     public static void main(String[] args)
//     {
//         List<Integer> l1= new ArrayList<Integer>();
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         System.out.println(l1);
//     }
// }















// import java.util.*;
// /**
//  * ACJ4_list
//  */
// public class ACJ4_list {

//     public static void main(String[] args)
//     {
//         List<Integer> l1= new ArrayList<Integer>();
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);
//         System.out.println(l1);

//         l1.remove(1);
//         System.out.println(l1);
//     }
// }









// import java.util.*;
// /**
//  * ACJ4_list
//  */
// public class ACJ4_list {

//     public static void main(String[] args)
//     {
//         List<Integer> l1= new ArrayList<Integer>();
//         l1.add(1);//0
//         l1.add(2);//1
//         l1.add(3);//2
//         l1.add(1);//3
//         l1.add(2);//4
//         l1.add(3);//5
//         System.out.println(l1);

//         l1.remove(1);
//         System.out.println(l1);

//         System.out.println(l1.get(1));
//     }
// }












// import java.util.*;
// /**
//  * ACJ4_list
//  */
// public class ACJ4_list {

//     public static void main(String[] args)
//     {
//         List<Integer> l1= new ArrayList<Integer>();
//         l1.add(1);//0// add value in list
//         l1.add(2);//1
//         l1.add(3);//2
//         l1.add(1);//3
//         l1.add(2);//4
//         l1.add(3);//5// add value in list
//         System.out.println(l1);

//         l1.remove(1);// remove value from list
//         System.out.println(l1);

//         System.out.println(l1.get(1));// print one/index value from list

//         l1.set(4, 5);// replace value from list
//         System.out.println(l1);
//     }
// }









import java.util.*;
/**
 * ACJ4_list
 */
public class ACJ4_list {

    public static void main(String[] args)
    {
        List<Integer> l1= new ArrayList<Integer>();
        for(int i=0;i<=5;i++)
        {
            l1.add(i);//0// add value in list
        }
        
        System.out.println(l1);

        l1.remove(1);// remove value from list
        System.out.println(l1);

        System.out.println(l1.get(1));// print one/index value from list

        l1.set(4, 5);// replace value from list
        System.out.println(l1);
    }
}