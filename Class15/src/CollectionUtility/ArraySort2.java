package CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort2 {

	public static void main(String[] args) {
		
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(25);
		obj.add(12);
		obj.add(2);
		obj.add(58);
		obj.add(23);
		System.out.println("Input order: " +obj);
		
		// This is to sort array values at ascending order
		Collections.sort(obj);
		System.out.println("Ascending order: " +obj);
		
		// This is to sort array values at descending order
		Collections.reverse(obj);
		System.out.println("Descending order: " +obj);
		
		// This is to replace one value with another
		// We are replacing value '2' with '99'
		Collections.replaceAll(obj, 2, 99);	
		System.out.println("After replacing: " +obj);
	}

}
