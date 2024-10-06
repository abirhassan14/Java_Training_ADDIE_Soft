package Class_11;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> obj = new HashSet<> ();
		obj.add(1);
		obj.add(2);
		obj.add(2);
		System.out.println(obj);
		// Here set does not allow duplicate value. that's why we got only [1,2] values
		
	}

}
