package Class_11;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List <String> list = new ArrayList<> ();
		list.add ("Abir");
		list.add ("Nibir");
		list.add ("Meher");
		list.add(2, "Hassan");  // To set another data at a specific index 
		System.out.println(list);
		
		
		System.out.println(list.size()); // To see the size of the list
		System.out.println(list.get(2)); // To get the specific data
		
		System.out.println(list.remove(1)); // To remove a specific index value
		System.out.println(list);// to see the total array after removing the specific value
		
		/*list.clear();
		System.out.println(list);*/ // To clear the entire arraylist
		
		list.set(1, "Tanvir");		// To replace a specific index value with another
		System.out.println(list);
		
		/*ArrayList <String> list1 = new ArrayList<String> ();
		list1.add ("Abir");
		list1.add ("Nibir");
		list1.add ("Meher");
		System.out.println(list1);*/

	}

}
