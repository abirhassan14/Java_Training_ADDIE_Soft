package Class_3;

import java.util.Scanner;

public class Code_3_MaxNum {

	public static void main(String[] args) {
		//Get 3 value from user & determine the max number
		
		int a, b, c;
		Scanner obj = new Scanner (System.in);
		
		
	   	 System.out.println("Please enter your value of a:");
		 a = obj.nextInt();
		 System.out.println("Please enter your value of b:");
		 b = obj.nextInt();
		 System.out.println("Please enter your value of c:");
		 c = obj.nextInt();
		 
			
			  if ((a>b) && (a>c)) { 
				  System.out.println("The Max Number is a"); 
				  } 
			  else if((b>a) && (b>c)) { 
				  System.out.println("The Max Number is b"); 
				  } 
			  else {
				  System.out.println("The Max Number is c"); 
				  }
			 
	}

}
