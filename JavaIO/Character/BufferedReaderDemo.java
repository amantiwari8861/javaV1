import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) 
    {
        
        try 
        {
            // BufferedReader in = new BufferedReader(new FileReader("Read.txt"));
            // BufferedReader in = new BufferedReader(System.in);//error bcz System.in is not a object of Reader
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String s;
            int i;
            System.out.println("UNIX : type ctrl+d to exit cmd" + "\nWINDOWS : Type ctrl+C to exit cmd"+ "\nWINDOWS : Type ctrl+Z to exit code");
            // while ((s = in.readLine()) != null)
            while ((i = in.read()) != -1)
                System.out.print((char)i);
            System.out.println("Program terminated");
            in.close();
        } catch (IOException e) 
        {
            System.out.println("Problem reading file.");
        }

    }
}
