package Class_9;



public class MemberInnerClassQuesMain {

	public static void main(String[] args) {

		MemberInnerClassQues obj = new MemberInnerClassQues();
		
		MemberInnerClassQues.InnerClass1 obj1 = obj.new InnerClass1();
		obj1.showResult();

	}

}
