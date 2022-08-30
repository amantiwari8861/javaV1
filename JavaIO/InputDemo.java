import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);
        BufferedInputStream bis1=new BufferedInputStream(System.in);
        int i=0;
        try
        {
            System.out.println("Enter a character:");
            i=bis1.read();
       

        // System.out.println("you inputed in byte :"+i);
        // System.out.println("you inputed in char :"+(char)i);

        System.out.print("you inputed:");
        OutputStream os=System.out;
        BufferedOutputStream bos=new BufferedOutputStream(os);

        bos.write(i);
        bos.flush(); //necessary for printing
    }
    catch(IOException io)
    {
        System.out.println("unable to read");
    }


    }
}
