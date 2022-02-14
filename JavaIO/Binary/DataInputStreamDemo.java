import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) {
        try
        {
            InputStream is = new FileInputStream("DataInpDemo.txt");
            DataInputStream dis = new DataInputStream(is);
            // DataInputStream dis = new DataInputStream(System.in);
            System.out.println("The contents of the file are: ");
            System.out.println(new String(dis.readAllBytes()));
        }
        catch(IOException e)
        {
            System.out.println("Exception occured");
            e.printStackTrace();
        }
    }
}