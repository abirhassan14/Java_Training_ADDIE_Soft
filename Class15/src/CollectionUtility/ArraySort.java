package CollectionUtility;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		
		Integer [] a = {11,25,4,10,18,30,8};
		
		// This is to sort array values at ascending order
		Arrays.sort(a);
		System.out.println("Ascending order: " +Arrays.toString(a));
		
		// This is to sort array values at descending order
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Descending order: " +Arrays.toString(a));
	}

}
