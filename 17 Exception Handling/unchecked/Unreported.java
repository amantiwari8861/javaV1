import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Unreported {

    public static void main(String[] args) throws FileNotFoundException,IOException
    {
     
        // try {
            InputStream is=new FileInputStream("MyFileghvhvjh.txt");
            // InputStream is=new FileInputStream("MyFile.txt");
            System.out.println(new String(is.readAllBytes()));
            
        // } 
        // catch (FileNotFoundException e) 
        // {
        //     System.out.println(e.getMessage());
        // } 
        // catch (IOException e) 
        // {
        //     System.out.println(e.getMessage());
        // }
        System.out.println("after code");

    }
}