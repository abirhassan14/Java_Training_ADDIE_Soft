package MultithreadingAndConcurrency;

public class ThreadExampleMain {

	public static void main(String[] args) {
		
		ThreadExample1 example = new ThreadExample1();
		example.start();
		
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("KOLPOLOK Ltd.");
		}

	}

}
