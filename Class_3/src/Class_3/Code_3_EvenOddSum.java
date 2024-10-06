package Class_3;

import java.util.Scanner;

public class Code_3_EvenOddSum {

	public static void main(String[] args) {
		// Input n number & calculate total odd number or even number
		
		int n, i, sum=0;
		Scanner obj = new Scanner (System.in);
		
		
	   	 System.out.println("Please enter your value of n:");
		 n = obj.nextInt();
		 
		 if (n%2 == 0) {
			 for (i=0; i<=n; i=i+2) {
				 sum = sum + i;
			 }
			 System.out.println("Sum of total even number = " +sum);
		 }
		 else {
			 for (i=1; i<=n; i=i+2) {
				 sum = sum +i;
			 }
			 System.out.println("Sum of total odd number = " +sum);
		 }

	}

}
