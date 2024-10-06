package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinMethod {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(25);
		obj.add(12);
		obj.add(2);
		obj.add(58);
		obj.add(23);
		System.out.println("Input order: " +obj);
		
		int minvalue = Collections.min(obj);
		int maxvalue = Collections.max(obj);
		
		System.out.println("Minimum value: " +minvalue);
		System.out.println("Maximum value: " +maxvalue);
	}

}
