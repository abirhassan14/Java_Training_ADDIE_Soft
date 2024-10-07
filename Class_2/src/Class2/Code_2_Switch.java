package Class2;

import java.util.Scanner;

public class Code_2_Switch {

	public static void main(String[] args) {
		
		int a, b;
		Scanner obj = new Scanner (System.in);
		
	   	 System.out.println("Please enter your value of a:");
		 a = obj.nextInt();
		 System.out.println("Please enter your value of b:");
		 b = obj.nextInt();

		// Switch Operator
		 switch(a) {
		 	case 1:
		 		System.out.println("Value 1= " +a);
		 		break;
		 	case 2:
		 		System.out.println("Value 2= " +a);
		 		break;
		 	default:
		 		System.out.println("Default Value = " +a);
		 		break;
		 		
		 		
		 }
	}

}
