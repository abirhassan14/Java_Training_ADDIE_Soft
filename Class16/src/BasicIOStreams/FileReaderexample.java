package BasicIOStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileReaderexample {

	public static void main(String[] args) {

		try {
			FileReader obj = new FileReader("C:\\Md. Abir Hassan\\Class-16_30 sept\\Text_cow.txt");
			int character;
			
			
			while((character = obj.read()) != -1){
				System.out.print((char) character);
			}
			obj.close();	
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
	