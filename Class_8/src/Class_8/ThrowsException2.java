package Class_8;

public class ThrowsException2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for (int i=0; i<=20; i++) {
			System.out.println(i);
			Thread.sleep(1000); 
			/*Here "Thread.sleep(1000)" means the output will show 1 sec later 
			one after another*/
		}
	}

}
