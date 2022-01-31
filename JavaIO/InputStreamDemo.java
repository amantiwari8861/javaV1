import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        
        InputStream is = null;// Abstract class
        try{
        is=new FileInputStream("ReadFile.txt");
        // System.out.println(is.read()); //gives ASCII value of first character
        System.out.println((char)is.read()); //reading 1 byte at a time
        }
        catch( IOException e){
            System.out.println("File not found or IO Exception");
        }
        finally
        {
            try{
                if(is!=null)
                    is.close();
            }
            catch(IOException e){
                System.out.println("IO Exception");
            }
        }


    }
}