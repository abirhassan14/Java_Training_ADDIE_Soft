package Class_8;

public class NestedTry {
	public static void main(String[] args) {
		
		
		try {
			int a = 10;
			int b = 2;
			int c = a%b;
			System.out.println(c);
			
			try {
				System.out.println(a%c);
			}
			catch(ArithmeticException p) {
				System.out.println("First block execute but second block fail" +p);
			}
		}
		
		catch(ArithmeticException q) {
			System.out.println("First block fail" +q);
		}

	}
}
