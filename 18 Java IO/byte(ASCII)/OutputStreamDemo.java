import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String args[]) {
        try 
        {
            // OutputStream fout = new FileOutputStream("khushi.txt");
            OutputStream fout = new FileOutputStream("khushi.txt",true);
            fout.write(65);
            byte []b="hello aman tiwari".getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}