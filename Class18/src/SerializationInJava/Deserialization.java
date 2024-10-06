package SerializationInJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("emp.txt");
			ObjectInputStream obis = new ObjectInputStream(file);
			Employee emp = (Employee)obis.readObject();
			emp.display();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
