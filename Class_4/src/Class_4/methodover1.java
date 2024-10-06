package Class_4;

public class methodover1 {

	public static void main(String[] args) {
		// Method overloading
		
		methodover2 obj = new methodover2();
		
		int value = obj.addvalue(50, 50); 
		System.out.println(value);
		
		int value2 = obj.multivalue(5, 10); 
		System.out.println(value2);
		
		float value3 = obj.dividevalue(7f, 3f); 
		System.out.println(value3);

	}

}
