import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFromUser {

    public static void main(String[] args) {
        
        // try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) 
        try (BufferedReader br=new BufferedReader(new FileReader("Kumkum.txt"))) 
        {
            System.out.println("Enter data :");
            String data=br.readLine();
            System.out.println(data);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}