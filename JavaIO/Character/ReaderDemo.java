import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
public static void main(String[] args) throws IOException {
    
    Reader r=new FileReader("Read.txt");
    // System.out.println(r.ready());
    // System.out.println(r.read());
    System.out.println(r.read());
    // char arr[]=new char[500];
    // r.read(arr);
    // System.out.println(arr);
    // r.read(arr, 4, 7); not working
    // System.out.println(arr);
    // r.skip(6);
    // r.read(arr,0, 7);
    // System.out.println(arr);   
    r.close();

    // FileReader (and indeed anything extending Reader) is indeed for text
    // InputStream and OutputStream are for binary data, such as mp4 files.
}
    
}