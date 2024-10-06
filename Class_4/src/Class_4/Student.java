package Class_4;

public class Student {

	private String name;
	private String email;
	private int age;
	private String mobile;
	private String adress;
	private double examfee;
	
		public void setname(String name) {
		this.name = name;
		}

		public void setemail(String email) {
		this.email = email;
		}
		
		public void setage(int age) {
		this.age = age;	
		}

		public void setmobile(String mobile) {
		this.mobile = mobile;
		}

		public void setadress(String adress) {
		this.adress = adress;
		}
		
		public void setexamfee(double examfee) {
		this.examfee = examfee;
		}
		
		
		public String getname() {
			return name;
		}
		public String getemail() {
			return email;
		}
		public int getage() {
			return age;
		}
		public String getmobile() {
			return mobile;
		}
		public String getadress() {
			return adress;
		}
		public double getexamfee() {
			return examfee;
		}
		
}
