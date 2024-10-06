package Class2;

import java.util.Scanner;

public class Code_2_Statement {

	public static void main(String[] args) {

		// if Statement
		int a, b, c;
		Scanner obj = new Scanner(System.in);

		System.out.println("Please enter your value of a:");
		a = obj.nextInt();
		System.out.println("Please enter your value of b:");
		b = obj.nextInt();
		
		System.out.println("Please enter your value of c:"); 
		c = obj.nextInt();
		  
		  
		  if (a>b) { System.out.println("Result 1= " +(a+b)); 
		  } 
		  else if (b>c) {
		  System.out.println("Result 2= " +(b+c)); 
		  } else 
		  {
		  System.out.println("Result 3= " +(a*b)); }
		 

		if (a>b) {
			System.out.println("Result 1= " +(a*b));
		}
		else {
			System.out.println("Result 2= " +(a-b));
		}
	}

}
