package Class_9;

public class MemberMain {

	public static void main(String[] args) {

		MemberInnerClass obj = new MemberInnerClass();
		
		MemberInnerClass.InnerClass2 obj1 = obj.new InnerClass2();
		System.out.println("First Sum = " +obj1.sum);
		MemberInnerClass.InnerClass3 obj2 = obj.new InnerClass3();
		System.out.println("Second Sum = " +obj2.sum1);
	}

}
