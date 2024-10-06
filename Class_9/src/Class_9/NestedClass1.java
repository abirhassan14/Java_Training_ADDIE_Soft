package Class_9;


public class NestedClass1 { // This is outer class

	
		// Nested Class
		
		static int a = 20;
		int b = 10;
		private static int c = 30;
		
		static int display() {
			return a/2;
		}
		
		static class InnerClass{	// This is inner class
			int result = NestedClass1.display();
			NestedClass1 obj1 = new NestedClass1();
			/*Here we cannot access an instance variable from a static class. 
			 * So we have to create an instance for int b. Because it is not 
			static type. So we have to make an object to access the value b*/
			
			
			int e = a+c+obj1.b;	
		}

}
