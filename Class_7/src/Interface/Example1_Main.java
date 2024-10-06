package Interface;

public class Example1_Main {

	public static void main(String[] args) {
		
		Example1_Class obj = new Example1_Class();
		
		System.out.println("Addition = " +obj.first(10, 20));
		obj.second(15, 10);
		obj.third();
		System.out.println("Divide = " +obj.fourth(7, 3));
		
	}

}
