package BasicIOStreams;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/* Queation: Create a new file on your PC at any location.
   Then write anything inside this file & read this data in your console.
   Use FileOutputStream & FileInputStream */

public class CreateNewFileQues2 {
	
	public static void main(String[] args) throws IOException {
		
		// Creating a new file
		File file = new File("C:\\Md. Abir Hassan\\Class-16_30 sept\\New_File2.txt");
		if (file.createNewFile()) {
			System.out.println("File Created Successfully");
		} else {
			System.out.println("File Already Exists");
		}
		
		// Writing on that created file
		// If we use FileOutputStream then we have to use .getBytes() 
		FileOutputStream obj = new  FileOutputStream("C:\\Md. Abir Hassan\\Class-16_30 sept\\New_File2.txt");
		obj.write("I love biriyani \n".getBytes());
		obj.write("I live in Agargaon \n" .getBytes());
		obj.write("ADDIE Soft \n" .getBytes());
		obj.write("Meow, Meow, Meow, Meow, Meow" .getBytes());
		obj.close();
		System.out.println("File Written Successfully \n \n ");
	
		
		// Reading that file
		FileInputStream obj1 = new FileInputStream("C:\\Md. Abir Hassan\\Class-16_30 sept\\New_File2.txt");
		int reader;
		while((reader = obj1.read()) != -1) {
			System.out.print((char)reader);
		}
		obj1.close();
	}

}
