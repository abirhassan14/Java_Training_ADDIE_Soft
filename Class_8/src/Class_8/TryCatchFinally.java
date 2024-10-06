package Class_8;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		
		try {
			int [] a = {1,2,3,4,5};
			System.out.println(a[4]);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		finally {
			System.out.println("Bangladesh");
		//finally block will always execute whether try and catch block executes or not
		}
		
	}
}
