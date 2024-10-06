package Class_3;

import java.util.Scanner;

public class Code_3_NestedForLoop {

	public static void main(String[] args) {
		// Nested for loop
		
		int n, i, j;
		Scanner obj = new Scanner (System.in);
		
		
	   	 System.out.println("Please enter your value of n:");
		 n = obj.nextInt();
		 
		 
		 for (i =1; i<=n; i++) {
			 //System.out.println(i);
			 for(j=1; j<=i; j++) {
				 System.out.print("*"); // print() for printing in the same line
				// System.out.println("*"); // println() for printing in the next line
			 }
			 System.out.println();
		 }
		
	}

}
