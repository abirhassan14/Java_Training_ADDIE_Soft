package Class_Test1;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// MAx And Min Number
		
				int a, b, c;
				
				Scanner obj = new Scanner(System.in);
				
				System.out.println("Put the value of a  = ");
				a = obj.nextInt();
				System.out.println("Put the value of b  = ");
				b = obj.nextInt();
				System.out.println("Put the value of c  = ");
				c = obj.nextInt();
				
				if(a>b && b>c) {
					System.out.println("The max number is a");
				}
				else if(b>a && b>c){
					System.out.println("The max number is b");
				}
				else {
					System.out.println("The max number is c");
				}
				
				if(a<b && b<c) {
					System.out.println("The min number is a");
				}
				else if(b<a && b<c){
					System.out.println("The min number is b");
				}
				else {
					System.out.println("The min number is c");
				}
				
	}

}
