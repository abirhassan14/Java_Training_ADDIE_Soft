package Inheritance;

public class MethodOver2 {

	int calculation(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	int calculation(int a, int b, int c) {
		int sum = a*b*c;
		return sum;
	}
	
	int calculation(int a) {
		return a*5;
	}
}
