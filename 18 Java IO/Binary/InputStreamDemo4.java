import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo4 {
    public static void main(String[] args) {
      
        byte b[] = new byte[100];
        try(InputStream is=new FileInputStream("ReadFile.txt"))
        {
            System.out.println("available bytes :"+is.available());//available bytes 14
            // is.read(b);
            // b=is.readAllBytes();//returns a byte array of 14 bytes
           /*  b[0]=(byte)is.read();//1 byte read
            b[1]=(byte)is.read();//1 byte read
            b[2]=(byte)is.read();//1 byte read
            System.out.println(new String(b));//prints all 3 bytes
            System.out.println("available bytes :"+is.available());//prints available bytes i.e 14-3=11
 */
            is.read(b, 3,6);//reads 6 bytes
            System.out.println(new String(b));//prints all 11 bytes
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