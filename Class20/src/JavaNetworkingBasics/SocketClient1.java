package JavaNetworkingBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient1 {

public static void main(String[] args) {
		
		try {
			
			Socket socket = new Socket("localhost", 5240);
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			// Send a message to the server
			writer.println("Hello! From the server");
			
			// Read response from the server
			String response = reader.readLine();
			System.out.println("Hi server: "+response);
			
			// Close connection
			socket.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
