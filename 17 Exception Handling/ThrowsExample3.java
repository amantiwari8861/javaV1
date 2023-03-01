import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ThrowsExample3
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        
            FileReader frReader=new FileReader("outut.txt");
            BufferedReader br=new BufferedReader(frReader);
            System.out.println(br.readLine());
            br.close();            
       
        System.out.println("hiii");


    }
}