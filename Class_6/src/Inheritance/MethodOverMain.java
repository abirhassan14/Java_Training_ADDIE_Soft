package Inheritance;

public class MethodOverMain {

	public static void main(String[] args) {
		// Input 3 values. Calculate addition, substraction & multiplication

		MethodOver2 obj = new MethodOver2 ();
		
		int value1, value2, value3;
		
		value1 = obj.calculation(5,10);
		value2 = obj.calculation(20,5,10);
		value3 = obj.calculation(25);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}

}
