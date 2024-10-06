package Class_11;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> list = new ArrayList<> ();
		list.add ("Abir");
		list.add ("Nibir");
		list.add ("Meher");
		list.add(2, "Hassan");  // To set another data at a specific index 
		System.out.println(list);
		
		// for each loop is used for printing the data one after another
		for (String li: list) {		
			System.out.println(li);
		}
	}
}
