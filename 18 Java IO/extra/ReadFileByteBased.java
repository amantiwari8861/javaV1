import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileByteBased {

    public static void main(String[] args) {
        
        try (FileOutputStream fos=new FileOutputStream("Mydata.txt", true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        )
        {
            // bos.write(67);
            bos.write("Aman Sir !!".getBytes());
            System.out.println("Succesfully written in file!");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("unable to find file");
        }
        catch(IOException i)
        {
            System.out.println("unable to do IO operation "+i.getMessage());
        }

        try (FileInputStream fis=new FileInputStream("Mydata.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        )
        {
            byte b[]=bis.readAllBytes();
            System.out.println("The data in file is :");
            System.out.println(new String(b));
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("unable to find file");
        }
        catch(IOException i)
        {
            System.out.println("unable to do IO operation "+i.getMessage());
        }

    }
}