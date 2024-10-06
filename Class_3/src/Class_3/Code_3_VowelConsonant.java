package Class_3;

import java.util.Scanner;

public class Code_3_VowelConsonant {

	public static void main(String[] args) {
		// Input a character and find if it is vowel or consonant
		
		char ch;
		Scanner obj = new Scanner (System.in);
		
		
	   	 System.out.println("Please enter your value of a:");
		 ch = obj.next().charAt(2); 
		 /*Here (0) inside the charAt represents the index value. That means this index will only consider
		 first index(first character). If I put (2) inside charAt that means it will consider third character*/
		 if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u') {
			 System.out.println(" VOWEL = " +ch); 
		 }
		 else {
			 System.out.println(" CONSONANT = " +ch); 
		 }

	}

}
