package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortExample {

	public static void main(String[] args) {
		
		List<Integer> obj = Arrays.asList(5,0,8,2,1);
		System.out.println(obj);
		
		//To sorting data in ascending order
		Collections.sort(obj);
		System.out.println(obj);
		
		//To sorting data in decending order
		Collections.reverse(obj);
		System.out.println(obj);

	}

}
