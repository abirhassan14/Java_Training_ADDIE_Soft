package Class_8;

public class MultipleTryCatch {
	public static void main(String[] args) {
		
		//First try catch		
		try {
			int [] a = {1,2,3,4,5};
			System.out.println(a[3]);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		
		
		//Second try catch
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}
		catch(ArithmeticException v) {
			System.out.println(v);
		}
	}
}
