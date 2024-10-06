package Lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		// LinkedList
		
		List<Integer> obj = new LinkedList();
		obj.add(1);
		obj.add(2);
		obj.addFirst(5);// This value will go to the first index
		obj.addLast(10);// This value will go to the last index
		
		System.out.println(obj);
		System.out.println(obj.get(1)); // Get specific index value
		System.out.println(obj.getFirst());//Print First index value
		System.out.println(obj.getLast());//Print last index value
		System.out.println("Size: " +obj.size());//To see the size of Linkedlist
		
		//To print the value individually one after another 
		for(Integer list: obj) {
			System.out.println(list);
		}
	}

}
