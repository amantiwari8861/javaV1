import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCsv {
    public static void main(String[] args) {
        

        try {
            
            BufferedReader bis=new BufferedReader(new FileReader("Data.csv"));
            // System.out.println(bis.readLine());
            // System.out.println(bis.readLine());
            
            System.out.println();
            String line;
            for (int l=0;(line=bis.readLine()) != null;l++) 
            {
                // System.out.println(line);
                if (l==0) 
                {
                    line=line.substring(3, line.length());
                }
                String columnData[]=line.split(",");
                for (int i = 0; i < columnData.length; i++) 
                {
                    System.out.printf("%-12s",columnData[i]);
                }
                System.out.println();
            }
            bis.close();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
}}
