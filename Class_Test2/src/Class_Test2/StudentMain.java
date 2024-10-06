package Class_Test2;

public class StudentMain {

	public static void main(String[] args) {
		
		// Student 1 info
		Student obj = new Student();
		obj.setfathername("Abdul");
		obj.setmothername("Sokina");
		obj.setrollno(25);
		
		System.out.println(obj.getfathername());
		System.out.println(obj.getmothername());
		System.out.println(obj.getrollno());
		
		
		// Student 2 info
		Student obj2 = new Student();
		obj2.setfathername("Kamal");
		obj2.setmothername("Jorina");
		obj2.setrollno(17);
		
		System.out.println(obj2.getfathername());
		System.out.println(obj2.getmothername());
		System.out.println(obj2.getrollno());
		
		// Student 2 info
		Student obj3 = new Student();
		obj3.setfathername("Salam");
		obj3.setmothername("komola");
		obj3.setrollno(36);
				
		System.out.println(obj3.getfathername());
		System.out.println(obj3.getmothername());
		System.out.println(obj3.getrollno());
				
		
	}

}
