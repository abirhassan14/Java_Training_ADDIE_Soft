package Class_4;

public class Code_4_1_Polymorphism {

	public static void main(String[] args) {
		// Polymorphism
		
		
		  Code_4_1_Polymorphism obj = new Code_4_1_Polymorphism (); 
		  int value = obj.addvalue(5, 10); 
		  System.out.println(value);
		 
		
		Polymorphism2 obj2 = new Polymorphism2();
		obj2.display();
	}
	
	
	  int addvalue(int a, int b) { // This is [addvalue()] a new method outside ofmain method 
	  int sum = a+b; 
	  return sum;
	  }
	 
	// Now we will create a different class and will access it from main class
}


	
