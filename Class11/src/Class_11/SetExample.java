package Class_11;

import java.util.HashSet;
import java.util.Set;

/* Question: Create a class called "SetExample". Inside this class create 2 Hashset.
Add three values to those HashSet. Print the first set value individually and 
compare those two set. Print compare result. */

public class SetExample {

	public static void main(String[] args) {
		
		// First HashSet
		Set<String> obj = new HashSet<> ();
		obj.add("Abir");
		obj.add("Nibir");
		obj.add("Tanvir");
		System.out.println(obj);
		
		// Printing all value independently
		for(String data: obj) {
			System.out.println(data);
		}
		
		// Second HashSet
		Set<String> obj1 = new HashSet<> ();
		obj1.add("Abir");
		obj1.add("Nibir");
		obj1.add("Joy");
		System.out.println(obj1);
		
		// Comparing the two sets
		boolean Result = obj.equals(obj1);
		System.out.println(Result);
	}
}
