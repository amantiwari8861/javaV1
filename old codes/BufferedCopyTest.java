import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopyTest {

    public static void main(String[] args) 
    {
        try (BufferedReader bufInput=new BufferedReader(new FileReader(args[0]));BufferedWriter bufoutput=new BufferedWriter(new FileWriter(args[1]));)
        {
            String line="";
            while((line=bufInput.readLine())!=null)
            {
                bufoutput.write(line);
                bufoutput.newLine();
            }
        }
        catch(FileNotFoundException f)
        {
            System.out.println(f);
        }
        catch(IOException f)
        {
            System.out.println(f);
        }
    }
}