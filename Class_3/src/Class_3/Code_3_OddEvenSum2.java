package Class_3;

import java.util.Scanner;

public class Code_3_OddEvenSum2 {

	public static void main(String[] args) {
		// Input n number & calculate total odd number & even number together
		
			
			int n, i, totaleven=0, totalodd=0;
			Scanner obj = new Scanner (System.in);
			
		    System.out.println("Please enter your value of n:");
		    n = obj.nextInt();

		    for(i=0; i<=n; i++) {
		    	if(i%2 == 0) {
		    		totaleven = totaleven + i;
		    	}
		    	else {
		    		totalodd = totalodd + i;
		    	}
		    }
		    
		    System.out.println("Total even number = " +totaleven); 
		    System.out.println("Total odd number = " +totalodd); 
	}

}
