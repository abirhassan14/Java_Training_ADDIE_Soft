package Class_3;

import java.util.Scanner;

public class Code_3_Multiplication_Table {

	public static void main(String[] args) {
		// Input n number & create a multiplication table of this number
		
		int n, i, num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter your number:");
		n = obj.nextInt();
		
		for(i=1; i<=10; i++) {
			num = n * i;
			System.out.println(n+ " * " +i+ " = " +num);
		}
		
	}

}
