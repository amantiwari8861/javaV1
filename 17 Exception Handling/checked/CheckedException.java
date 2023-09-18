import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException 
{
    public static void main(String[] args) throws IOException
    {
        String msg=null;
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        try
        {
            fis=new FileInputStream("Data.txt");
            bis=new BufferedInputStream(fis);
            msg=new String(bis.readAllBytes());
        }
        catch(FileNotFoundException f)
        {
            System.out.println("Error !! file not found : "+f.getLocalizedMessage());
        }
        catch(IOException e)
        {
            System.out.println("unable to read file!!");
            e.printStackTrace();
        }
        finally
        {
            if (fis!=null) {
                fis.close();
            }
            if (bis!=null) {
                bis.close();
            }
        }

        System.out.println(msg);
    }   
}
