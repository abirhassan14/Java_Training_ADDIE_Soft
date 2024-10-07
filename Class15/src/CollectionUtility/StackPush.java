package CollectionUtility;


import java.util.Stack;

public class StackPush {

	public static void main(String[] args) {

		// Stack is used to use push data
		Stack<Integer> obj = new Stack<>();
		obj.push(2);
		obj.push(4);
		obj.push(5);
		obj.push(8);
		obj.push(16);
		obj.push(20);
		
		// pop() is used to print in reverse order 
		while(!obj.isEmpty()) {
			System.out.println(obj.pop());
		}
	}
}
