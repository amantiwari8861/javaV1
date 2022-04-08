import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) throws IOException{
        
        Writer w=new FileWriter("Write.txt",true);
        // w.write("Hello World");
        // w.append(" by Aman");
        // w.write("$Ritik-Rawat",2,5);
        // //System.out.println(w.toString());     //toString() is not implemented in Writer.
        // String st="Ritik";
        // char name[]=st.toCharArray();
        char arr[]={'R',' ','I',' ','T',' ','I',' ','K'};
        // w.write(name);
        w.write(arr);
        w.flush();
        w.close();
       
    }
}
