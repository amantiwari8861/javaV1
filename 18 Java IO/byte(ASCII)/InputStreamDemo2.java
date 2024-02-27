import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo2 {
    public static void main(String[] args) {
        
       try (InputStream is = new FileInputStream("ReadFile.txt")) 
       {
            // System.out.println((char)is.read()); //for 1 byte
            while (true)
            {
                int i = is.read();
                if (i == -1) //here -1 means end of file
                    break;
                System.out.print((char) i);
            }
            //one by one character is reading is not efficient that's why we use BufferedReader
        }
        catch( FileNotFoundException e){
            System.out.println("File not found");
        }
        catch( IOException e){
            System.out.println("IO Exception");
        }
    }
}