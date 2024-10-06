package Class_Test2;


public class MathOperation {
	
	float operation(float x, float y) {
		double add = x+y;
		System.out.println("Addition = " +add);
		
		double sub = x-y;
		System.out.println("Substraction = " +sub);
		
		double multi = x*y;
		System.out.println("Multiplication = " +multi);
		
		double div = x/y;
		System.out.println("Division = " +div);
		return 0;
		
		
	}


	double operation(double a, double b) {
		double add = a+b;
		System.out.println("Addition = " +add);
		
		double sub = a-b;
		System.out.println("Substraction = " +sub);
		
		double multi = a*b;
		System.out.println("Multiplication = " +multi);
		
		double div = a/b;
		System.out.println("Division = " +div);
		return 0;
	}
}
