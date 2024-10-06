package BasicIOStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOuputStreamEx {

	public static void main(String[] args) throws IOException{
		
		BufferedOutputStream buff = new BufferedOutputStream(new FileOutputStream("C:\\Md. Abir Hassan\\Class-16_30 sept\\File_Buffered.txt"));
		buff.write("My name is Abir \n" .getBytes());
		buff.write("Orange \n" .getBytes());
		buff.write("Mango \n" .getBytes());
		buff.write("Apple \n" .getBytes());
		buff.flush();  // For 'BufferedOutputStream' we use .flush() instead of .clode() 
		
		System.out.println("File Written Successfully \n \n");

		BufferedInputStream buff1 = new BufferedInputStream(new FileInputStream("C:\\Md. Abir Hassan\\Class-16_30 sept\\File_Buffered.txt"));
		int reader ;
		while((reader = buff1.read()) != -1 ) {
			System.out.print((char) reader);
		}
		buff1.close();
	
	}

}
