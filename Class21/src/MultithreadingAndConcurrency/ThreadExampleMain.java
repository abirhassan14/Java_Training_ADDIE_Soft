package MultithreadingAndConcurrency;

public class ThreadExampleMain {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadExample1 example = new ThreadExample1();
		example.start();
		
		
		
		for(int i=1; i<=10; i++) {
			System.out.println("KOLPOLOK Ltd.");
			Thread.sleep(1000);
		}
	}
}
