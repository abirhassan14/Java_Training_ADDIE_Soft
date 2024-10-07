package MultithreadingAndConcurrency;

public class ThreadScedulerExampleMain {

	public static void main(String[] args) {
		
		ThreadScedulerExample ts = new ThreadScedulerExample();
		ThreadScedulerExample ts1 = new ThreadScedulerExample();
		ThreadScedulerExample ts2 = new ThreadScedulerExample();
		
		ts.setName("Thread One");
		ts1.setName("Thread Two");
		ts2.setName("Thread Three");
		
		ts.start();
		ts1.start();
		ts2.start();

	}

}
