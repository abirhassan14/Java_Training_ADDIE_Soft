package Interface;

public class Example1_Class implements Example1{

	@Override
	public int first(int a, int b) {
		
		return a+b;
	}

	
	@Override
	public void second(int a, int b) {
		
		int c =  (a-b);
		System.out.println("Substraction = " +c);
	}

	
	@Override
	public String third() {
		
		System.out.println("My name is Abir");
		return null;
	}

	
	@Override
	public double fourth(double x, double y) {
		
		return (x/y);
	}

}
