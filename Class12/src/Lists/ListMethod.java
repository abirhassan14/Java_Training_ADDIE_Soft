package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		// List Method
		List <String> list = new ArrayList<> ();
		
		List<String> list2 = Arrays.asList("Ant", "Bat", "Cat");
		System.out.println(list2);
		
		list.add("Orange");
		list.add("Mango");
		list.addAll(list2); //to add previous all values with the new ones
		System.out.println(list);
		
		list.addAll(0,list2); //to add previous all values with the new ones at a spec
		System.out.println(list);

	}

}
