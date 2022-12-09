// Server2 class that
// receives data and sends data

import java.io.*;
import java.net.*;

class Server2 {

	public static void main(String args[])
		throws Exception
	{

		// Create server Socket
		ServerSocket ss = new ServerSocket(8081);

		// connect it to client socket
		Socket s = ss.accept();
		System.out.println("Connection established");

		// to send data to the client
		PrintStream ps
			= new PrintStream(s.getOutputStream());

		// to read data coming from the client
		BufferedReader br
			= new BufferedReader(
				new InputStreamReader(
					s.getInputStream()));

		// to read data from the keyboard
		BufferedReader kb
			= new BufferedReader(
				new InputStreamReader(System.in));

		// server executes continuously
		while (true) {

			String str, str1;

			// repeat as long as the client
			// does not send a null string

			// read from client
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				str1 = kb.readLine();

				// send to client
				ps.println(str1);
			}

			// close connection
			ps.close();
			br.close();
			kb.close();
			ss.close();
			s.close();

			// terminate application
			System.exit(0);

		} // end of while
	}
}
