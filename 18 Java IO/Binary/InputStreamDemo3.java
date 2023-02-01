import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo3 {
    public static void main(String[] args) {
        
       try (InputStream is = System.in) 
       {
            // System.out.println((char)is.read()); //for 1 byte
         byte b[] = new byte[100];
         for(int i=0;i<b.length;i++)
         {
            b[i] = (byte)is.read();
            if(b[i]==46)
                break;
          }
            System.out.println(new String(b));
            //one by one character is reading is not efficient that's why we use BufferedReader
        }
        catch( IOException e){
            System.out.println("IO Exception");
        }


    }
}