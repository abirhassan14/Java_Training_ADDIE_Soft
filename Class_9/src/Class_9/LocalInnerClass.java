package Class_9;

public class LocalInnerClass {
	
	void display (){
		
		class Inner {
			int a = 10;
			int b = 20;
			int multi = a*b;
		}
		Inner obj = new Inner();
		System.out.println("Multiplication = " +obj.multi);
	}

}


