import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaByteIO {

    public static void main(String[] args) {
        
        final String FILE_PATH="C:\\Users\\Desktop\\cleaner.bat";
        InputStream is=null;
        try {
            is=new FileInputStream(FILE_PATH);
            System.out.println((char)is.read());
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("didn't get the file :"+e.getLocalizedMessage());
        } 
        catch (IOException e) 
        {
            System.out.println("error :"+e.getLocalizedMessage());
        }
        finally
        {
            try {
                if (is!=null) 
                {
                    is.close();
                }
            } 
            catch (IOException e) 
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thank you!!");
    }
}