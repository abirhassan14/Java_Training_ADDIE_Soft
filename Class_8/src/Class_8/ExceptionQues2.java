package Class_8;

import java.util.Scanner;

public class ExceptionQues2 {

	public static void main(String[] args) {
		// Question 2
		int a, b, c;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the first value = ");
		a = obj.nextInt();
		System.out.println("Enter the second value = ");
		b = obj.nextInt();
		System.out.println("Enter the third value = ");
		c = obj.nextInt();
		
		
		try {
			int x = a%b;
			System.out.println(x);
			
			try {
				System.out.println(x%c);
			}
			catch(ArithmeticException v) {
				System.out.println("First block execute but second block fail "+v);
			}
		}
		catch(ArithmeticException vv) {
			System.out.println("First block fail "+vv);
		}
		
		finally {
			System.out.println("Bangladesh is beautiful");
		}
	}

}
