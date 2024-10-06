package Class_5;

public class Array3 {

	public static void main(String[] args) {
		// Create an array. this array has 10 elemnents. Add this array
		
		
		int [] n = {5,5,5,5,5,5,5,5,5,5};
		int sum = 0;
		
		// Using for loop
		
		for(int i=0; i<n.length; i++) { 
		sum = sum+n[i];
		  
		}
		 
		 
		// Using foe each loop
		for(int i: n) {			
			sum = sum + i;
		}
				
		System.out.print("The sum is = " +sum);

	}

}
