package MapsAndHashing;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashmap1 {

	public static void main(String[] args) {
		
		Map<Integer, String> obj = new LinkedHashMap<>();
		
		obj.put(20, "Tiger");
		obj.put(30, "Lion");
		obj.put(55, "Cat");
		obj.put(85, "Dog");
		obj.put(110, "Cheetah");
		System.out.println(obj);
		
		
		// Printing Key elements one by one
		for(Integer obj1:obj.keySet() ) {
			System.out.println(obj1);
		}
		for(String obj2:obj.values() ) {
			System.out.println(obj2);
		}
		
	}

}
