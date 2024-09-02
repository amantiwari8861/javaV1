import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInput {
  public static void main(String[] args){
    int counter=0;
    String S;
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(ir);
    System.out.print("UNIX : type ctrl+d to exit"+"\nWINDOWS : Type ctrl+Z to exit");
    try
    {
        S=in.readLine();
        while (counter<5) 
        {
        System.out.println("read:"+S);
        S=in.readLine();
        counter++;    
        }
        in.close();
    }
    catch(IOException e)
    {
        e.printStackTrace();

    }        
}
}
