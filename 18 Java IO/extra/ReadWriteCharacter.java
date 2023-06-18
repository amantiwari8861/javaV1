import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteCharacter 
{
    public static void main(String[] args) {
        
         
        try (FileWriter fw=new FileWriter("MyData2.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
        )
        {
            // bw.write(67);
            bw.write("Aman Sir !!");
            System.out.println("Succesfully written in file!");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("unable to find file");
        }
        catch(IOException i)
        {
            System.out.println("unable to do IO operation "+i.getMessage());
        }

        try (FileReader fr=new FileReader("MyData2.txt");
        BufferedReader br=new BufferedReader(fr);
        )
        {
            int ch;
            System.out.println("The data in file is :");
            while ((ch=br.read()) != -1) 
            {
                System.out.print((char)ch);
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("unable to find file");
        }
        catch(IOException i)
        {
            System.out.println("unable to do IO operation "+i.getMessage());
        }


    }
}