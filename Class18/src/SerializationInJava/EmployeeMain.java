package SerializationInJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee obj = new Employee("Md. Abir Hassan", "01779063648", "abir@gmail.com", "Web Developer"); 

		// Or we could set the name by this method
		/* Employee obj1 = new Employee();
		obj1.setEmpName("Abir");	*/
		
		try {
			FileOutputStream file = new FileOutputStream("emp.txt");
			ObjectOutputStream obs = new ObjectOutputStream(file);
			obs.writeObject(obj);
			obs.close();
			file.close();
			System.out.println("System Serialized Successfully");
			
		}catch(IOException e){
			e.printStackTrace();
		}
		obj.display();
	}
}
