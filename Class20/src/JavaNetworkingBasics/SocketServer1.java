package JavaNetworkingBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer1 {

	public static void main(String[] args) {
		
		try {
			
			// Create serversocket port
			ServerSocket serverSocket = new ServerSocket(5240); 
				// Here '5240' is a port num. It can be any number
			System.out.println("Server is listening from port 5240");
			
			// Client connected
			Socket socket = serverSocket.accept();
			System.out.println("Client Connected");
			
			// Received message from client
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			// Sent message to client
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			
			// Read message from client
			String message = reader.readLine();
			System.out.println("Received from client: "+message);
			
			// Sent response back to the client
			writer.println("Hello from sarver");
			
			// Close connection
			socket.close();
			serverSocket.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
