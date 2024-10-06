package Class_Test1;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// Arithmatic Operator

		int a, b;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Put the value of a  = ");
		a = obj.nextInt();
		System.out.println("Put the value of b  = ");
		b = obj.nextInt();
		
		System.out.println("The Addition is = " +(a+b));
		System.out.println("The Substraction is = " +(a-b));
		System.out.println("The Multiplication is = " +(a*b));
		System.out.println("The Division is = " +(a/b));
		System.out.println("The Modulus is = " +(a%b));
	}
}
