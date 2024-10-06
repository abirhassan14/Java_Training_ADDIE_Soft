package AdvancedIOTechniques;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataInputOutputStreamEx {

	public static void main(String[] args) {
		
		// Data writing
		try {
		DataOutputStream obj= new DataOutputStream(new FileOutputStream("C:\\Md. Abir Hassan\\Class-17_01 Oct\\Output Stream.txt"));
		obj.writeInt(10);
		obj.writeDouble(2000.26);
		obj.writeFloat(45.66f);
		obj.writeChar('A');
		obj.writeChars("Tiger \n");
		obj.write("Abir ".getBytes());
		obj.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// Data Reading 
		try {
			DataInputStream obj1 = new DataInputStream(new FileInputStream("C:\\Md. Abir Hassan\\Class-17_01 Oct\\Output Stream.txt"));
			
			System.out.println(obj1.readInt());
			System.out.println(obj1.readDouble());
			System.out.println(obj1.readFloat());
			System.out.println(obj1.readChar());
			
			int reader ;
			while((reader = obj1.read()) != -1 ) {
				System.out.print((char)reader);
			}
			obj1.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
