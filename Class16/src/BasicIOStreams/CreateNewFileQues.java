package BasicIOStreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Queation: Create a new file on your PC at any location.
Then write anything inside this file & read this data in your console */

public class CreateNewFileQues {

	public static void main(String[] args) throws IOException {
		
		// Creating a new file
		File file = new File("C:\\Md. Abir Hassan\\Class-16_30 sept\\New_File.txt");
		if (file.createNewFile()) {
			System.out.println("File Created Successfully");
		} else {
			System.out.println("File Already Exists");
		}
		
		// Writing on that created file
		FileWriter obj = new  FileWriter("C:\\Md. Abir Hassan\\Class-16_30 sept\\New_File.txt");
		obj.write("My favourite fruit is mango \n");
		obj.write("Bangladesh is a beautiful country \n");
		obj.write("JAVA is a very important language \n");
		obj.write("Meow, Meow, Meow, Meow, Meow");
		obj.close();
		System.out.println("File Written Successfully \n \n ");
	
		
		// Reading that file
		FileReader obj1 = new FileReader("C:\\Md. Abir Hassan\\Class-16_30 sept\\New_File.txt");
		int reader;
		while((reader = obj1.read()) != -1) {
			System.out.print((char)reader);
		}
		obj1.close();
	}
}
