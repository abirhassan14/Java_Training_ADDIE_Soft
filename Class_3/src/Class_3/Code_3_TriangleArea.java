package Class_3;

import java.util.Scanner;

public class Code_3_TriangleArea {

	public static void main(String[] args) {
		// Calculate the area of a triangle
		
		int base, height;
		float area;
		Scanner obj = new Scanner (System.in);
		
		
	   	 System.out.print("Please enter your value of base:");
		 base = obj.nextInt();
		 System.out.print("Please enter your value of height:");
		 height = obj.nextInt();
		 
		
		area = (base*height)/2;
		System.out.println("The area of the triangle = " +area);

	}

}
