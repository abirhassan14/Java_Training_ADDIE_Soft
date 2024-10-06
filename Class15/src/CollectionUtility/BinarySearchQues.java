package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchQues {

	public static void main(String[] args) {
		
		List<Integer> obj = new ArrayList<>();
		obj.add(5);
		obj.add(7);
		obj.add(60);
		obj.add(52);
		obj.add(18);
		obj.add(9);
		obj.add(31);
		obj.add(6);
		obj.add(27);
		obj.add(50);
		
		Collections.sort(obj);
		
		System.out.println("Input Values: " +obj);
		int target = obj.get(3);
		
		int result = BiranySearch(obj,target);
		
		if(result == -1) {
			System.out.println("The target element is not found in the array");
		}else {
			System.out.println("The Element is: "+result);
		}

	}

	private static int BiranySearch(List<Integer> obj1, int target1) {
		int start = 0;
		int end = obj1.size()-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(target1>obj1.get(mid)) {
				start = mid+1;
			}else if(target1<obj1.get(mid)) {
				end = mid-1;
			}else {
				return obj1.get(mid);
			}
		}
		
		return -1;
	}

}
