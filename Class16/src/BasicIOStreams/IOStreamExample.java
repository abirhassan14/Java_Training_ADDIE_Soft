package BasicIOStreams;

import java.util.Scanner;

public class IOStreamExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// Here System.in is an input stream
		int a = sc.nextInt();
		
		System.out.println("abc");	// Here System.out is an output stream
		System.out.println("def");
		
		System.err.println("xyz");	// Here System.err is to print an error
		
		
	}

}
