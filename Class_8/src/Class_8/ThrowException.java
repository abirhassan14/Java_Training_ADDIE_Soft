package Class_8;



public class ThrowException {

	public static void main(String[] args)  {
		// Throw Exception
		
		try {
			vote(19);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		
	}
		
		public static void vote(int a) {
			if(a<18) {
				throw new IllegalArgumentException("Age must be 18");
			}
			else {
				System.out.println("Is Voter ");
			}
		}

}
