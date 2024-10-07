package MultithreadingAndConcurrency;

public class ThreadRunnableEx implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=1; i<=5; i++) {
				System.out.println("Tiger IT Ltd.");
				Thread.sleep(1000);
				/* Here sleep(1000) is used to delay the output for 1 sec. 
				  (1000 milisecond = 1 second) */
			}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
