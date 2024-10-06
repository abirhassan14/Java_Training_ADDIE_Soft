package Class_7;

public class AbstractMain {

	public static void main(String[] args) {
		
		Abstract1 obj = new Abstract2();
		obj.one();
		/* We are creating an instance for Abstract1(Super class) 
		but we are calling Abstract2 (Sub class)*/	
		
		Abstract1 obj2 = new Abstract3();
		obj2.one();
		
		
	}

}

