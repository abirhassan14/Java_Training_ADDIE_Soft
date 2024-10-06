package Class_8;

public class MultipleCatch {

	public static void main(String[] args) {
		//Multiple Catch
		
		try {
			int a = 10;
			int b = 2;
			int c = a%b;
			System.out.println(c);
			
			String m = "BANGLADESH";
			System.out.println(m.toLowerCase());
			
			String n = "12";
			int p = Integer.parseInt(n);
			System.out.println(p);
			
			int [] arr = {1,2,3};
			System.out.println(arr[9]);	
		}
		
		catch(ArithmeticException vv) {
			System.out.println(vv);
		}
		catch(NullPointerException nn) {
			System.out.println(nn);
		}
		catch(NumberFormatException xx) {
			System.out.println(xx);
		}
		catch(ArrayIndexOutOfBoundsException yy) {
			System.out.println(yy);
		}
		
	}

}
