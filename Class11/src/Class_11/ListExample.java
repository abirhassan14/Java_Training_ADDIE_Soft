package Class_11;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
			
			List <String> list = new ArrayList<> ();
			list.add("Abir");
			list.add("Nibir");
			list.add("Tanvir");
			list.add("Joy");
			list.add("Jubayer");
			
			// replacing 4th value
			list.set(3, "Hassan");	
			System.out.println(list);
			
			// Getting 2nd value
			System.out.println("Second Value = " +list.get(1)); 
			
			// Printing all value independently
			for (String li: list) {		
				System.out.println(li);
			}

	}

}
