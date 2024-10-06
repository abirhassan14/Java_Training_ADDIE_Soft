package SetQueues;

import java.util.PriorityQueue;

public class PriorityQueueExample {


	public static void main(String[] args) {
		
		PriorityQueue<Integer> obj = new PriorityQueue<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		System.out.println("Priority Queue = "+obj);
		
		System.out.println(obj.poll());		// To remove the first element of the array(Same as remove() keyword)
		System.out.println(obj);
		
		System.out.println(obj.peek());		// To pick the first element of an array
		
		obj.offer(31);
		obj.offer(25);
		System.out.println(obj);
	}

}
