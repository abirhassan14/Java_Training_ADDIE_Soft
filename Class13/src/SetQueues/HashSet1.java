package SetQueues;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSet1 {

	public static void main(String[] args) {
		
		Set<String> obj = new HashSet<> ();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Lemon");
		obj.add("Mango");
		obj.add("Jack Fruit");
		
		System.out.println(obj);
		
		obj.remove("Mango");	// Remove any specific data
		System.out.println(obj);
		System.out.println("Size of the array: " +obj.size());	// Size of the array
		System.out.println("Contains: "+obj.contains("Lemon")); // Contains Method
		
		//obj.clear();	// To clear all data from an array or set
		//System.out.println("Clear all data: "+obj); 
		System.out.println("isEmpty Method: "+obj.isEmpty()); // isEmpty Method
		
		// Use of Iterator to print value individually
		Iterator<String> it = obj.iterator();
		while(it.hasNext()){
			System.out.println("Using Iterator: " +it.next());
		}
		
		//To print the value individually one after another without using Iterator
		for(String list: obj) {
			System.out.println("Using for each loop: " +list);
		}
	}

}
