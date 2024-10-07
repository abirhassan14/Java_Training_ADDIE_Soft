package MultithreadingAndConcurrency;

public class ThreadExample1 extends Thread{	
	//Here thread is a pre defined method in java
	
	public void run() {
		
		try {
		for(int i=1; i<=5; i++) {
			System.out.println("ADDIE Soft Ltd.");
			Thread.sleep(1000);
			/* Here sleep(1000) is used to delay the output for 1 sec. 
			  (1000 milisecond = 1 second) */
		}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
