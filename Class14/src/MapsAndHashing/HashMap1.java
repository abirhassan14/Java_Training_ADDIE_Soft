package MapsAndHashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<String, Integer> obj = new HashMap<>();
		obj.put("Abir", 25);
		obj.put("Nibir", 20);
		obj.put("Tanvir", 20);
		obj.put("Jahangir", 40);
		obj.put("Abir", 50);	// Same Key but different value replaces the previous value
		//obj.put(null, null);	// Supports null value. We can insert only one null data
		System.out.println(obj);
		
		obj.remove("Tanvir");
		System.out.println("After remove: "+obj);
		
		System.out.println(obj.get("Nibir")); // To get the value of a certain key
		
		obj.replace("Abir", 555); // To replace the value of a certain key
		System.out.println(obj);
		
		//This is for seeing the data one after another
		for(Map.Entry<String, Integer> data:obj.entrySet()) {
			System.out.println(data.getKey() + " " +data.getValue());
		}
	}

}
