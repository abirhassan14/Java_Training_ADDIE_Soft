package Class_9;

public class NestedClassMain {

	public static void main(String[] args) {
		
		NestedClass1.InnerClass obj = new NestedClass1.InnerClass();
		//Here we are InnerClass through NestedClass1 
		
		System.out.println(obj.result);
		System.out.println(obj.e);
	}

}
