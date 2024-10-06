package Class_8;

public class ExceptionQues1 {

	public static void main(String[] args) {
		
				
		try {
			String a = "Kamal";
			int c = Integer.parseInt(a);
			System.out.println(c);
		}
		
		
		catch(NumberFormatException aa) {
			
			System.out.println(aa);			// For regular print
			aa.printStackTrace();			// For viewing the exception with line indicated
			System.out.println(aa.getMessage());	// This will only show the exception reason message
			System.out.println(aa.toString());	// this is also like regular print
			
		}
		
	}

}