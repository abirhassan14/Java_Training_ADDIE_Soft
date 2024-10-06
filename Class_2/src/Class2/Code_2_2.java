package Class2;

import java.util.Scanner;

public class Code_2_2 {
	
	public static void main(String[] args) {
		
	int a, b, c;
	Scanner obj = new Scanner (System.in);
	
   	 System.out.println("Please enter your value of a:");
	 a = obj.nextInt();
	 System.out.println("Please enter your value of b:");
	 b = obj.nextInt();
	 System.out.println("Please enter your value of c:");
	 c = obj.nextInt();
	
	 // Arithmetic Operator
	System.out.println("Addition = " +(a+b));
	System.out.println("Substruction = " +(a-b));
	System.out.println("Multiplication = " +(a*b));
	System.out.println("Division = " +(a/b));
	
	// Relational Operator 
	  System.out.println("Greater than = " +(b>a));
	  System.out.println("Less than = " +(b<a));
	  System.out.println("Greater than equal = " +(a>=c));
	  System.out.println("Less than equal = " +(a<=c));
	  System.out.println("Not equal = " +(a!=b)); System.out.println("Equal = "
	  +(a==c));
	 
	
	// Logical operator
	System.out.println("And Operator = " +((b<a) && (b>c)));
	System.out.println("Or Operator = " +((b<a) || (b>c)));
	System.out.println("Not Operator = " +!(a==c));
	}
}
