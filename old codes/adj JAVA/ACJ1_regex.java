 
 // what is regex?
// regex is regular experession in java
// its define a patten for searching or manipulation string.

// java.util.regex package provides this classes and interface :-
// 1. matchresult interface
// 2. matcher classes
// 3. pattern classes
// 4. pattern syntax class





// import java.util.regex.*;
// // import java.util.*;
// /**
//  * ACJ1_regex
//  */
// public class ACJ1_regex
// {
//     public static void main(String[] args)
//     {
//         Pattern p=Pattern.compile(".s");
//         Matcher m=p.matcher("as");
//         boolean b=m.matches();//1st
//         System.out.println(b);
        
        
//     }
    
// }







// import java.util.regex.*;
// // import java.util.*;
// /**
//  * ACJ1_regex
//  */
// public class ACJ1_regex
// {
//     public static void main(String[] args)
//     {
//         Pattern p=Pattern.compile(".s");
//         Matcher m=p.matcher("as");
 
//         boolean b=m.matches();//1st
//         System.out.println(b);
        
//         boolean bp2=Pattern.compile(".s").matcher("is").matches();//2nd 
//         System.out.println(bp2);

//         boolean bp3=Pattern.matches(".s", "ss");
//         System.out.println(bp3);

//     }
    
// }











// import java.util.regex.*;
// /**
//  * ACJ1_regex
//  */
// public class ACJ1_regex
// {
//     public static void main(String[] args)
//     {
//         System.out.println(Pattern.matches("[pattern match]", "[pattern match]")); 
//         System.out.println(Pattern.matches("[pattern]", "p"));
//         System.out.println(Pattern.matches("[pattern]", "pat"));
           
//     }
// }












// import java.util.regex.*;
// /**
//  * ACJ1_regex
//  */
// public class ACJ1_regex
// {
//     public static void main(String[] args)
//     {
//         System.out.println(Pattern.matches("[pattern match]", "[pattern match]")); 
//         System.out.println(Pattern.matches("[pattern]", "p"));
//         System.out.println(Pattern.matches("[pattern]?", "pat"));
//         System.out.println(Pattern.matches("[pattern]?", "a"));
//         System.out.println("__________________________________________");
//         System.out.println(Pattern.matches("[amd]+", "a"));
//         System.out.println(Pattern.matches("xyz+", "xxx"));
        
//     }
// }











import java.util.regex.*;
/**
 * ACJ1_regex
 */
public class ACJ1_regex
{
     public static void main(String[] args)
    {
        System.out.println(Pattern.matches("\\d", "acb")); 
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "443"));
        System.out.println(Pattern.matches("//d", "323abc"));
        System.out.println("__________________________________________");
        System.out.println(Pattern.matches("[amd]+", "a"));
        System.out.println(Pattern.matches("xyz+", "xxx"));
        
    }
}
