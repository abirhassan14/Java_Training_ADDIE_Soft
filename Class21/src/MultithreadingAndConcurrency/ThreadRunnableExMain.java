package MultithreadingAndConcurrency;

public class ThreadRunnableExMain {

	public static void main(String[] args) throws InterruptedException{
		
		ThreadRunnableEx ex = new ThreadRunnableEx();
		Thread thread = new Thread(ex);
		thread.start();
		// Here, at first we have to declare "Thread" before we can use "start()"
		
		for(int i=1; i<=5; i++) {
			System.out.println("DPDC Ltd.");
			Thread.sleep(1000);
		}

	}

}
