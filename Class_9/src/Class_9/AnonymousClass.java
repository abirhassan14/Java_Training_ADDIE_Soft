package Class_9;

public class AnonymousClass implements AnonymousInnerInterface {

	@Override
	public String showdata() {
		
		return "HIS NAME IS ABIR & HIS AGE IS " +m;
	}
	
	public static void main(String[] args) {
		AnonymousClass obj = new AnonymousClass();
		System.out.println(obj.showdata());
		
	}

}
