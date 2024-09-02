// io(InPut/OutPut)stream in java
// in java we are useing the concept of io stream to make input-output operation fast.
// in java.io package contains all classes required for InPut-OutPut stream operations.
// stream operations :-
//     1. Systrem.out
//     2. Systrem.in
//     3. Systrem.err






// // import java.io*;
// import java.io.FileInputStream;

// /**
//  * ACJ13_input_output_stream
//  */
// public class ACJ13_input_output_stream
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//         FileInputStream fin1= new FileInputStream("file/demo1.txt");
//         int i=fin1.read();
//         System.out.println((char)i);
//         fin1.close();
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }    
//     }
// }














// import java.io.FileInputStream;
// /**
//  * ACJ13_input_output_stream
//  */
// public class ACJ13_input_output_stream
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             FileInputStream fin1= new FileInputStream("file/demo1.txt");
//             int i;
//             while((i=fin1.read())!=-1)
//             //{        System.out.println((char)i);   }//all file data print with new line
//             {System.out.print((char)i);} //print all data in same line
//             fin1.close();
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }    
//     }
// }











// import java.io.*;
// /**
//  * ACJ13_input_output_stream
//  */
// public class ACJ13_input_output_stream
// {
//     public static void main(String[] args)throws Exception
//     {
//         FileOutputStream fops1 = new FileOutputStream("file/demo1.txt");
//         BufferedOutputStream bops1 = new BufferedOutputStream(fops1);
//         String s ="this is buffer data";
//         byte b[]=s.getBytes();
//         bops1.write(b);
//         bops1.flush();
//         bops1.close();
//         System.out.println("that is okay and done");    
//     }
    
// }
















// import java.io.*;
// /**
//  * ACJ13_input_output_stream
//  */
// public class ACJ13_input_output_stream
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             FileInputStream fips1= new FileInputStream("file/demo1.txt");
//             BufferedInputStream bips1 = new BufferedInputStream(fips1);
//             int i;
//             while((i=bips1.read())!=-1)
//             {                System.out.print((char)i);            }
//             bips1.close();
//             fips1.close();
//         }
//         catch(Exception e){  System.out.println(e);   }    
//     }
// }














// import java.io.*;
// /**
//  * ACJ13_input_output_stream
//  */
// public class ACJ13_input_output_stream
// {
//     public static void main(String[] args)throws Exception
//     {
//         FileInputStream fis1 =new  FileInputStream("file/demo1.txt");
//         FileInputStream fis2 =new FileInputStream("file/demo2.txt");
//         SequenceInputStream sis1=new SequenceInputStream(fis1,fis2);
//         int i;
//         while ((i=sis1.read())!=-1) {   System.out.print((char)i);    }
//         sis1.close();
//         fis1.close();
//         fis2.close();            
//     }
// }












// import java.io.*;
// /**
//  * ACJ13_input_output_stream
//  */
// public class ACJ13_input_output_stream
// {
//     public static void main(String[] args)throws Exception
//     {
//         FileInputStream fis1 = new FileInputStream("file/demo1.txt");
//         FileInputStream fis2 = new FileInputStream("file/demo2.txt");
//         FileOutputStream fos1 =new FileOutputStream("file/out1put1.txt");
//         SequenceInputStream sis1=new SequenceInputStream(fis1,fis2);
//         int i;
//         while ((i=sis1.read())!=-1)
//         {   
//             // System.out.print((char)i);
//             fos1.write(i);
//         }
//         sis1.close();
//         fos1.close();
//         fis1.close();
//         fis2.close();            
//     }
// }












import java.io.*;
import java.util.*;
/**
 * ACJ13_input_output_stream
 */
public class ACJ13_input_output_stream
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis1=new FileInputStream("file/demo1.txt");    
        FileInputStream fis2=new FileInputStream("file/demo2.txt");    

        Vector v1=new Vector();
        v1.add(fis1);
        v1.add(fis2);

        Enumeration e1=v1.elements();
        SequenceInputStream sis1=new SequenceInputStream(e1);
        int i=0;
        while((i=sis1.read())!=-1)
        {
            System.out.print((char)i);
        }
        sis1.close();
        fis1.close();
        fis2.close();        
    }
}