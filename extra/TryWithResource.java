import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {
        
        // final String FILE_PATH="C:\\Users\\Desktop\\cleaner.bat";
        final String FILE_PATH="C:\\Users\\admin\\Desktop\\cleaner.bat";
        try(InputStream is=new FileInputStream(FILE_PATH);) 
        {
            // System.out.println((char)is.read());
            // System.out.println((char)is.read());
            // System.out.println((char)is.read());
            // System.out.println((char)is.read());
            // System.out.println("----------------------------");
            // byte arr[]=is.readAllBytes();
            // System.out.println(new String(arr));
            int i;
            while ((i=is.read())!=-1) 
            {
                System.out.print((char)i);
                if((char)i == 'q')
                {
                    break;
                } 
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("didn't get the file :"+e.getLocalizedMessage());
        } 
        catch (IOException e) 
        {
            System.out.println("error :"+e.getLocalizedMessage());
        }
        System.out.println("Thank you!!");
    }
}