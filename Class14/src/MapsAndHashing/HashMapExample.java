package MapsAndHashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> obj = new HashMap<String, Integer>();
		
		obj.put("Tiger", 20);
		obj.put("Lion", 50);
		obj.put("Cat", 90);
		obj.put("Dog", 110);
		obj.put("Cheetah", 50);
		System.out.println(obj);
		
		// Getting 1 value
		System.out.println("Get Value: "+obj.get("Cat"));
		
		// Checking key is present
		if (obj.containsKey("Tiger")) {
			System.out.println("The key is present");
		} else {
			System.out.println("The key not found");
		}
		
		// Replacing 1 value
		obj.replace("Cheetah", 555);
		System.out.println("Replaced value: " +obj);
		
		// Printing element one by one
		for(Map.Entry<String, Integer> data:obj.entrySet()) {
			System.out.println(data.getKey()+" "+data.getValue());
		} 
			
	}

}
