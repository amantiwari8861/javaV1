import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        
        //Buffer means the collection of bytes that are read from the stream
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Hello.txt"));
            System.out.println("The contents of the file are: ");
            // System.out.println((char)bis.read()); //h
            // System.out.println(new String(bis.readAllBytes()));//ello there 
            //----------------------------------------------------------------------------------
            // System.out.println((char)bis.read()); //h
            // bis.reset();//IOException if the stream is not reset(bcz mark is not set)
            // System.out.println(new String(bis.readAllBytes()));//ello there
            if(bis.markSupported()){
                bis.mark(0);
                System.out.println((char)bis.read()); //h
                System.out.println((char)bis.read()); //e
                System.out.println((char)bis.read()); //l
                System.out.println((char)bis.read()); //l
                System.out.println((char)bis.read()); //o
                bis.reset();
                System.out.println((char)bis.read());
            }
            else{
                System.out.println("Mark is not supported");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("IO Exception");
            e.printStackTrace();
        }
    }
}