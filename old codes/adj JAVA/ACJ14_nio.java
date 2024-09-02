// what is NIO in java.
// NIO is new input output system in java.
// NIO give different way of working in java with i/o system then standeard io or
// its an alternate io api for java.

// NIO's components is:-
// 1.  Channels        - Datagram, Socket, File, ServerSocket Channel 
// 2.  Selectors       - Thread, object
// 3.  Non-blocking io - recvfrom(), 1. input 2 output java block
// 4.  Buffers         - char, Double, int, Float, Long, Short, Byte Buffer




// import java.io.*;
// import java.nio.*;
// import java.nio.channels.ReadableByteChannel;
// import java.nio.channels.WritableByteChannel;
// /**
//  * ACJ14_nio
//  */
// public class ACJ14_nio
// {
//     public static void main(String[] args) throws IOException
//     {
//         FileInputStream input1   = new FileInputStream("file/demo1.txt");
//         ReadableByteChannel rbc1 = input1.getChannel();
//         FileOutputStream output1 = new FileOutputStream("file/demo10.txt");
//         WritableByteChannel wbc1 = output1.getChannel();
//         copyData(rbc1,wbc1);
//         rbc1.close();
//         wbc1.close();
//     }
//     private static void copyData(ReadableByteChannel src, WritableByteChannel dest)throws IOException
//     {
//         ByteBuffer buffer = ByteBuffer.allocateDirect(20*1024);
//         while(src.read(buffer)!=-1)
//         {
//             buffer.flip();
//             while(buffer.hasRemaining())
//             {
//                 dest.write(buffer);
//             }
//             buffer.clear();
//         }
//     }
// }

















import java.io.*;
import java.nio.*;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * ACJ14_nio
 */
public class ACJ14_nio
{
    public static void main(String[] args) 
    {
        Path file=null;
        BufferedReader br1=null;
        try
        {
            file=Paths.get("file/demo1.txt");
            InputStream input1   = Files.newInputStream(file);
            br1 new BufferedReader(new InputStreamReader(input1));
            System.out.println("read text file:- "+br1.readLine());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try{
                br1.close();
            }
            catch(IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
    }
}