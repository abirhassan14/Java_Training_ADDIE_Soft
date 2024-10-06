package Class_9;


public class MemberInnerClassQues {

	//Create a member inner class. Sum 1 to 100 odd and even number
	int i = 1;
	int j = 100;
	
	class InnerClass1{
		int even =0;
		int odd =0;
		
		void showResult() {
			for (int m=i; m<=j; m++) {
				if(m%2 == 0) {
					 even = even+m;
				}
				else {
					odd = odd+m;
				}
			}
			System.out.println("Sum of even numbers = " +even);
			System.out.println("Sum of odd numbers = " +odd);
		}
	}
	
}
