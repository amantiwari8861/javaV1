import java.io.FileNotFoundException;

import csv.CsvReader;

public class FileHandler 
{
    private final String FILE_NAME;
    FileHandler(String filename)
    {
        FILE_NAME=filename;
    }
    void initiate()
    {
        System.out.println("ur filname is :"+FILE_NAME);
        if(FILE_NAME.endsWith(".csv"))
        {
            CsvReader csvReader=new CsvReader(FILE_NAME);
            csvReader.read();
            csvReader.printData();
        }
        
    }
}