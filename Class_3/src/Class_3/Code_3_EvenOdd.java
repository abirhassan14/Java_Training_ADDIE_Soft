package Class_3;

import java.util.Scanner;

public class Code_3_EvenOdd {

	public static void main(String[] args) {
		// Get 1 value from user & determine if that's even or odd
		
		int a;
		Scanner obj = new Scanner (System.in);
		
	   	 System.out.println("Please enter your value of a:");
		 a = obj.nextInt();
		 
		 if (a%2 == 0) {
			 System.out.println("The number is EVEN");
		 }
		 else {
			 System.out.println("The number is ODD");
		 }

	}

}
