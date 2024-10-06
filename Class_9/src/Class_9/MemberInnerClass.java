package Class_9;

public class MemberInnerClass {

	int a = 10;
	int b = 30;
	static int c = 5;
	
	class InnerClass2{
		int d = 25;
		int sum = a+b+c;
	}
	
	class InnerClass3{
		InnerClass2 obj = new InnerClass2();
		int sum1 = obj.sum+obj.d;
	}
}
