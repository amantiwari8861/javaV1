import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamDemo {
    public static void main(String[] args) {
        
        InputStream is = null;// Abstract class
        try{
            // is=new FileInputStream("ReadFile.txt");
            // is=new FileInputStream("C:/Users/Aman_Tiwari/Desktop/Shivam.txt");
            // is=new FileInputStream("C://Users//Aman_Tiwari//Desktop//Shivam.txt");
            is=new FileInputStream("C:\\Users\\Aman_Tiwari\\Desktop\\Shivam.txt");
            // System.out.println(is.read()); //gives ASCII value of first character
            System.out.println((char)is.read()); //reading 1 byte at a time
        }
        catch(FileNotFoundException f)
        {
            System.out.println("pls check if path is valid");
        }
        catch( IOException e){
            System.out.println("File not found or IO Exception");
        }
        finally
        {
            try
            {
                if(is!=null)
                    is.close();
            }
            catch(IOException e)
            {
                System.out.println("IO Exception");
            }
        }


    }
}