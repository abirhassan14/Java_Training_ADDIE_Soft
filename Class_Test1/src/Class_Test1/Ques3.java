package Class_Test1;

public class Ques3 {

	public static void main(String[] args) {
		// 1 to 100 odd and even number
		
		int a, b;
		
		// This loop is for Even numbers
		for (int i=0; i<=100; i++) {
			if(i%2 == 0) {
				a = i;
				System.out.print(a +(", "));
			}	
		}
		
		System.out.println();
		
		
		// This loop is for Odd numbers
		for (int j=0; j<=100; j++) {
			if(j%2 != 0) {
				b = j;
				System.out.print(b +(", "));
			}
		}
		
	}

}


