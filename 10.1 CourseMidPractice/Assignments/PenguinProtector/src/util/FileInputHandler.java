package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class FileInputHandler 
{
    private final String FILE_NAME="src//filedata//colony.txt";
    public FileInputHandler()
    {
        readDataFromFile();
    }
    public String[] readDataFromFile()
    {
        Scanner console=null;
        try  
        {
            console = new Scanner(new FileReader(FILE_NAME));
            Object inpArray[]=Arrays.stream(console.nextLine().trim().split(",")).toArray();
            String[] fileInp = new String[inpArray.length];
            for (int i = 0; i < inpArray.length; i++) 
            {
                fileInp[i] = String.valueOf(inpArray[i]);
            }
            // System.out.println(Arrays.toString(fileInp));
            // String fileInp[]=console.nextLine().split(",");
            return fileInp;
        } 
        catch(NumberFormatException ne)
        {
            System.out.println("only integer values is acceptable in file!");
        }
        catch(FileNotFoundException f)
        {
            System.out.println("colony.txt file is not present !!");
        }
        finally
        {
            if (console!=null) 
            {
                try 
                {
                    console.close();
                } 
                catch (Exception e) 
                {
                    System.out.println("Error :");
                }
            }
        }
        return null;
    }
    
}
