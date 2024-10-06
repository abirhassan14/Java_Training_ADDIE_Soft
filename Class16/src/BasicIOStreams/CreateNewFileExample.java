package BasicIOStreams;

import java.io.File;
import java.io.IOException;

/* Here we are creating a new file from code. We can create any type of file 
   (txt, docs, xlsx, png, jpeg) etc*/

public class CreateNewFileExample {

	public static void main(String[] args) throws IOException {
			
		File file = new File("C:\\Md. Abir Hassan\\Class-16_30 sept\\Text_2.xlsx");
			
		if(file.createNewFile()) {
			System.out.println("File Created Succesfully");
		}else {
			System.out.println("File Already Exists");
		}   
		
		// To check if the file exists &  location of the file
		if(file.exists()) {
			System.out.println("File name: "+file.getName());
			System.out.println("File location: "+file.getAbsolutePath());
		}else {
			System.out.println("File does not exists");
		}
	}
}
