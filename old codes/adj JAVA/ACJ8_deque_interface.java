
// what is deque interface in java?
// In java deque interface is a linear collection.
// deque interface supports element insertion & element removal at both ends.
// deque in an use for "double ended queue".





// import java.util.*;
// public class ACJ8_deque_interface
// {
//     public static void main(String[] args)
//     {
//         Deque<String> dqi1=new ArrayDeque<String>();
//         dqi1.add("Apple");
//         dqi1.add("banana");
//         dqi1.add("cherry");
//         dqi1.add("date");   
//         for(String fs1:dqi1)
//         {
//             System.out.println(fs1);
//         }
//     }  
// }














// import java.util.*;
// /**
//  * ACJ8_deque_interface
//  */
// public class ACJ8_deque_interface {

//     public static void main(String[] args) {
//         Deque<String> dq1=new ArrayDeque<String>();
//         dq1.offer("apple");
//         dq1.offer("banana");
//         dq1.offer("cherry");
//         dq1.offer("date");
        
//         System.out.println("add offerfirst ");

//         for(String s:dq1)
//         {
//             System.out.println(s);
//         }

//         System.out.println("_______________________________________________");

//         dq1.pollLast();
//         for(String s1:dq1)
//         {
//             System.out.println(s1);
//         }
//     }
// }











//import java.util.*;
/**
  Student /
class Student
{
    int id,S_class;
    String first_name, last_name, mail_id;
    public Student(int roll_no,String s_f_name, String s_l_name, String mailid, int sclass)
    {
        this.id         =   roll_no;
        this.first_name =   s_f_name;
        this.last_name  =   s_l_name;
        this.mail_id    =   mailid;
        this.S_class    =   sclass;
    }    
}
/**
 * ACJ8_deque_interface
 */
public class ACJ8_deque_interface {

    public static void main(String[] args)
    {
        Deque<Student> dq1=new ArrayDeque<Student>();
        
        Student s1= new Student(1, "kamal", "nain", "kamal@nain.com", 12);
        dq1.add(s1);

        //System.out.println(s1.id+" "+ s1.first_name+" "+ s1.last_name+" "+ s1.mail_id+" "+ s1.S_class);
    
        Student s2= new Student(2, "vimal", "nain", "vimal@nain.com", 3);
        dq1.add(s2);

        //System.out.println(s2.id+" "+ s2.first_name+" "+ s2.last_name+" "+ s2.mail_id+" "+ s2.S_class);
    
        for(Student fs1:dq1)
        {
            System.out.println(fs1.id+" "+ fs1.first_name+" "+ fs1.last_name+" "+ fs1.mail_id+" "+ fs1.S_class);
            
        }
    
    }
}