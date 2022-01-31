import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        
        byte b[] = new byte[100];
        try(InputStream is= new FileInputStream("ReadFile.txt"))
        {
            System.out.println("available bytes in is:"+is.available());//available bytes 0
            InputStream bin=new ByteArrayInputStream(is.readAllBytes());
            System.out.println("available bytes in bin:"+bin.available());//available bytes 14
            // System.out.println((char)bin.read());//for 1 byte
            bin.skip(2);//skips 2 bytes from the beginning
            System.out.println(new String(bin.readAllBytes()));//prints all 14 bytes
            bin.close();
          }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}