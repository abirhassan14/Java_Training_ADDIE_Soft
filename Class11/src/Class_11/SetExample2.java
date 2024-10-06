package Class_11;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

public static void main(String[] args) {
		
		Set<Integer> obj = new HashSet<> ();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		System.out.println(obj);
		
		// Here contains is used to see that if that value is present in that set
		System.out.println(obj.contains(2)); 
		
		/* isEmpty is used to see that if that set is empty or not. 
		If the set is empty the output will give "true" Button if the  
		set has a value it will give the output "false"*/
		System.out.println(obj.isEmpty());
		
		/* If 2 different object has same exact values then those 2 will be equal
		 and equals() is used to compare those two object. If same then output "true"*/
		Set<Integer> obj1 = new HashSet<> ();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		boolean Result = obj.equals(obj1);
		System.out.println(Result);
		
		// remove is used to remove a specific value that set contains
		obj.remove(2);			
		System.out.println(obj);
		
		// for each loop is used for printing the data one after another
		for(Integer data: obj) {
			System.out.println(data);
		}
		
		// removeAll is used to remove all value from a set
		obj.removeAll(obj);
		System.out.println(obj);

	}
}
