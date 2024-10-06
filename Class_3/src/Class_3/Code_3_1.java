package Class_3;

import java.util.Scanner;

public class Code_3_1 {

	public static void main(String[] args) {
		//Get 3 numbers in input & calculate the average of this number
		
		int a, b, c;
		float avg;
		Scanner obj = new Scanner (System.in);
		
		
	   	 System.out.println("Please enter your value of a:");
		 a = obj.nextInt();
		 System.out.println("Please enter your value of b:");
		 b = obj.nextInt();
		 System.out.println("Please enter your value of c:");
		 c = obj.nextInt();
		 
		 avg = ((a+b+c)/3f);
		 
		 System.out.println("The average is = " +avg);
	}

}
