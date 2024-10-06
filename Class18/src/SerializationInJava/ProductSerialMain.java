package SerializationInJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductSerialMain {

	public static void main(String[] args) throws IOException {
		
		Product obj = new Product("Cake", "Pastry", "Mithai", 5, 1800.85);
		
		FileOutputStream file = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeObject(obj);
		oos.close();
		file.close();
		System.out.println("Serialized Successfully");
		
		
	}

}
