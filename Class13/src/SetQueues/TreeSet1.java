package SetQueues;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> obj = new TreeSet();
		obj.add(5);
		obj.add(6);
		obj.add(0);
		obj.add(14);
		obj.add(9);
		obj.add(25);
		System.out.println("Tree Set = "+obj);
		
		// Different methods of Treeset
		System.out.println("First value: "+obj.first()); // Printing first value
		System.out.println("Last value: "+obj.last());	 // Printing last value
		System.out.println("Higher value after 10: "+obj.higher(10));	 // Higher value after a specific value
		System.out.println("Lower value before 10: "+obj.lower(10));	// Lower value before a specific value
		
		//To print the value individually one after another without using Iterator
		for(Integer list: obj) {
			System.out.println("Using for each loop: " +list);
		}
		
		
		//  For string value the output will give in lexical order	
		TreeSet<String> obj1 = new TreeSet<>();
		obj1.add("Apple");
		obj1.add("Orange");
		obj1.add("Mango");
		obj1.add("Banana");
		//obj1.add(null);
		System.out.println("Tree Set 2 = "+obj1);	
	}

}
