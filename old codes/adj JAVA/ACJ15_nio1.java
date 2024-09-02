


// data transfer between channels 



// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.nio.channels.FileChannel;
// import java.nio.channels.WritableByteChannel;
// /**
//  * ACJ15_nio1
//  */
// public class ACJ15_nio1
// {
//     public static void main(String[] argv) throws Exception
//     {
//         String[] if1= new String[]
//         {
//             "file/demo1.txt","file/demo2.txt"
//         };
//         String of1="file/outputdemo2.txt";
//         FileOutputStream output1= new FileOutputStream(new File(of1));
//         WritableByteChannel wbc1=output1.getChannel();
//         for(int j=0; j<if1.length;j++)
//         {
//             FileInputStream input10 = new FileInputStream(if1[j]);
//             FileChannel ic1=input10.getChannel();
//             ic1.transferTo(0, ic1.size(), wbc1);
//             ic1.close();
//             input10.close();
//         }
//         wbc1.close();
//         output1.close();
//     }
    
// }













import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
/**
 * ACJ15_nio1
 */
public class ACJ15_nio1
{
    public static void main(String[] args)
    {
        Charset cs1=Charset.forName("UTF-8");
        System.out.println(cs1.displayName(locale));
        System.out.println(cs1.canEncode());
        String s1="this is char string value";

        ByteBuffer bb1=ByteBuffer.wrap(s1.getBytes());
        CharBuffer cb1=cs1.decode(bb1);
        ByteBuffer newbb=cs1.encode(cb1);
        while(newbb.hasRemaining())
        {
            char c1=(char) newbb.get();
            System.out.println(c1);
        }
        newbb.clear();
    }
}