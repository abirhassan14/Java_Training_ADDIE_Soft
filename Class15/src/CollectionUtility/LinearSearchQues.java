package CollectionUtility;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchQues {

	public static void main(String[] args) {

		List<Integer> obj = new ArrayList<Integer>();
		obj.add(5);
		obj.add(10);
		obj.add(15);
		obj.add(25);
		obj.add(50);
		
		int target = obj.get(2);
		int result = Linear(obj,target);
		
		if(result == -1) {
			System.out.println("No Element Found");
		}else {
			System.out.println("The Element: "+result);
		}

	}

	private static int Linear(List<Integer> obj1, int tar) {
		for(int i=0; i<obj1.size(); i++) {
			
			if(obj1.get(i) == tar) {
				return obj1.get(i);
			}
		}
		return -1;
	}

}
