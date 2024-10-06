package SetQueues;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	/* Question: Create a program to store and retrieve unique vegetable name. 
	   Check if a certain vegetable is already enrolled, add a new vegetable if it is not 
	   already on the list & print all vegetable using iterator */
	
	public static void main(String[] args) {
		
		// Unique vegetable names
		Set<String> obj = new HashSet<String>();
		obj.add("Potato");
		obj.add("Onion");
		obj.add("Cucumber");
		obj.add("Carrot");
		System.out.println(obj);
		
		// Checking if a certain vegetable is already enrolled
		if(obj.contains("Carrot")) {
			System.out.println("This vegetable is enrolled in the set");
		}else {
			System.out.println("This vegetable is not found");
		}
		
		// Add a new vegetable
		obj.add("Eggplant");
		System.out.println(obj);
		
		// Print all vegetable using iterator
		Iterator<String> it = obj.iterator();
		while(it.hasNext()){
			System.out.println("Using Iterator: " +it.next());
		}
	}

}
