package Class_11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

public static void main(String[] args) {
		
		// Map<Key, Value> obj = new HashMap<>();
		Map<String, Integer> obj = new HashMap<>();
		
		// For List and set we use "add" but for map we use "put"
		obj.put("Apple", 20);
		obj.put("Orange", 30);
		obj.put("Banana", 50);
		obj.put("Mango", 70);
		System.out.println(obj);
		
		//This is for seeing the data one after another
		for(Map.Entry<String, Integer> data:obj.entrySet()) {
			System.out.println(data.getKey() + " " +data.getValue());
		}
		
		// This is for seeing the key & value data seperately
		for(String data : obj.keySet()) {
			System.out.println("Key " +data + " Value " +data);
		}
		
		// Only key data
		for (String data:obj.keySet()) {
			System.out.println(data);
		}
		
		// Only value data
		for (Integer data:obj.values()) {
			System.out.println(data);
		}
		
	}
}
