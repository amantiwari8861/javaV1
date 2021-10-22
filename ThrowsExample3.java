import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ThrowsExample3
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileReader niit=new FileReader("output.txt");
        BufferedReader br=new BufferedReader(niit);
        System.out.println(br.readLine());
        br.close();
    }
}