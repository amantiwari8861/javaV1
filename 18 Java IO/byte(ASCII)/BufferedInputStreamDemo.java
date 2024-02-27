import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        
        //Buffer means the collection of bytes that are read from the stream
        try{
            // FileInputStream fis=new FileInputStream("Hello.txt");
            // BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Hello.txt"));
            System.out.println("The contents of the file are: ");
            // System.out.println(bis.read()); //readd 104(h) and moves curser ahead
            // System.out.println((char)bis.read()); //i
            byte b[]=bis.readAllBytes();
            String s=new String(b);
            System.out.println(s);

            // System.out.println(new String(bis.readAllBytes()));//ello there
            //----------------------------------------------------------------------------------
            // System.out.println((char)bis.read()); //h
            // bis.reset();//IOException if the stream is not reset(bcz mark is not set) java.io.IOException: Resetting to invalid mark
            // System.out.println(new String(bis.readAllBytes()));//ello there
            // if(bis.markSupported()){
            //     System.out.println((char)bis.read()); //h
            //     bis.mark(0);//marking the stream
            //     System.out.println((char)bis.read()); //e
            //     System.out.println((char)bis.read()); //l
            //     System.out.println((char)bis.read()); //l
            //     System.out.println((char)bis.read()); //o
            //     System.out.println("after resetting ");
            //     bis.reset();
            //     System.out.println((char)bis.read());//e
            //     System.out.println((char)bis.read());//l
            //     System.out.println((char)bis.read());//l
            // }
            // else{
            //     System.out.println("Mark is not supported");
            // }
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