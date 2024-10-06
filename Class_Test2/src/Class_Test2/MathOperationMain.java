package Class_Test2;

public class MathOperationMain {

	public static void main(String[] args) {
		
		MathOperation obj = new MathOperation();
		
		double value1, value2;
		
		value1 = obj.operation(20, 10);
		System.out.println(value1);
		
		value2 = obj.operation(25, 15);
		System.out.println(value2);
		
		
		
		
		//for .concat
		String str1 = "20";
        String str2 = "10";
        String result1 = str1.concat(" ").concat(str2);
        System.out.println(result1);
        
		String str3 = "25";
        String str4 = "15";
        String result2 = str3.concat(" ").concat(str4);
        System.out.println(result2);
        
        
	}

}
