import  java.net.*;
import java.io.*;
public class Client
{
    Socket  socket;
    DataInputStream din;
    DataOutputStream dout;

    Client()
    {
        try
        {
            socket = new Socket("192.168.29.201",8081);
            din = new DataInputStream(socket.getInputStream());
            dout = new DataOutputStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String msg = "";
            String msg1 = "";
            while(!msg1.equals("exit"))
            {
                msg = br.readLine();
                dout.writeUTF(msg);
                msg1= din.readUTF();
                System.out.println(msg1);
                dout.flush();
            }
            din.close();
            dout.close();
            socket.close();
        }
        catch(Exception  e)
        {
            System.out.println("Exception found");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Client();
    }
}