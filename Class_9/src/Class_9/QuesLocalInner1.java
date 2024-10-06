package Class_9;

import java.util.Scanner;

public class QuesLocalInner1 {
	

	void display() {
		System.out.print("Enter the value of 'n' = ");
		
		class InnerClass {
			
			int a = 1;
			Scanner obj = new Scanner(System.in);
			int b = obj.nextInt();
			int result = (b*(b+a))/2;
	
	}
		InnerClass obj = new InnerClass();
		System.out.println("Sum = " +obj.result);
}
}