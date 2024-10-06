package Class_8;

public class Exception {

	public static void main(String[] args) {
		// Exception Handling
		
		int a = 10;
		int b = 0;
		  try {
			  double c = a/b;
			  System.out.println(c);
		  }
		  
		  catch(ArithmeticException abc) {
			  // Here we could also use "Exception" instead of ArithmaticException"
			  System.out.println(abc);
			  abc.printStackTrace();
			//.printStackTrace() is used for seeing the exception in what line in code
		  }
	}

}
