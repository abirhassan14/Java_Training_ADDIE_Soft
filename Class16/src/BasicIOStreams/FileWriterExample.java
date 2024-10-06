package BasicIOStreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		try {
			FileWriter obj = new FileWriter("C:\\Md. Abir Hassan\\Class-16_30 sept\\Text.txt");
			obj.write("Bangladesh is beautiful \n");
			obj.write("I love Mango \n");
			obj.write("Cow gives milk \n");
			obj.write("Samim vai code kore");
			
			obj.close();
			System.out.println("Successfully wrote the file");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
