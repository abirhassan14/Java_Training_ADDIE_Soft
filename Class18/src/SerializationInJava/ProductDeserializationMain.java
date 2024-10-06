package SerializationInJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ProductDeserializationMain {

	public static void main(String[] args) {
		
		try {
		FileInputStream file = new FileInputStream("abc.txt");
		ObjectInputStream obs = new ObjectInputStream(file);
		Product pro = (Product)obs.readObject(); 
		pro.console();
		
		
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
