package Class_4;

public class studentinfo {

	public static void main(String[] args) {
		
		//Student 1 info
		Student obj = new Student();
		obj.setname("Abir");
		obj.setemail("abir@gmail.com");
		obj.setage(25);
		obj.setmobile("01779063648");
		obj.setadress("Agargaon");
		obj.setexamfee(522.25);
		
		System.out.println(obj.getname());
		System.out.println(obj.getemail());
		System.out.println(obj.getage());
		System.out.println(obj.getmobile());
		System.out.println(obj.getadress());
		System.out.println(obj.getexamfee());
		
		//Student 2 info
		Student obj1 = new Student();
		obj1.setname("Hassan");
		obj1.setemail("abir2222@gmail.com");
		obj1.setage(35);
		obj1.setmobile("017790");
		obj1.setadress("Taltola");
		obj1.setexamfee(54842.25);
		
		System.out.println(obj1.getname());
		System.out.println(obj1.getemail());
		System.out.println(obj1.getage());
		System.out.println(obj1.getmobile());
		System.out.println(obj1.getadress());
		System.out.println(obj1.getexamfee());
		
		//Student 3 info
		Student obj2 = new Student();
		obj2.setname("Joy");
		obj2.setemail("joy@gmail.com");
		obj2.setage(24);
		obj2.setmobile("0*******8");
		obj2.setadress("dhaka");
		obj2.setexamfee(1003.6565);
				
		System.out.println(obj2.getname());
		System.out.println(obj2.getemail());
		System.out.println(obj2.getage());
		System.out.println(obj2.getmobile());
		System.out.println(obj2.getadress());
		System.out.println(obj2.getexamfee());
	}

	
}
