import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    ServerSocket server;
    Socket socket;
    DataInputStream din;
    DataOutputStream dout;

    Server()
    {
        try
        {
            server = new ServerSocket(8081);
            System.out.println("server started....");
            System.out.println("Waiting for client....");
            socket = server.accept();
            System.out.println("Client  connected...");
            din = new DataInputStream(socket.getInputStream());
            dout = new DataOutputStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String msg = "";
            String msg1 = "";
            while(!msg.equals("exit"))
            {
                msg1 = br.readLine();
                dout.writeUTF(msg1);
                msg = din.readUTF();
                System.out.println("Client: "+msg);
                dout.flush();
            }
            din.close();
            server.close();
            socket.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception found");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Server();
    }
}