package Class_5;

public class StudentMain {

	public static void main(String[] args) {


		Student[] st = new Student[3]; //Here Student is class name. Class name is also a non primitive data type
	//Data type [] variable = new Data type [String size]
		
		st[0] = new Student("Abir", 25, "22");
		st[1] = new Student("Hassan", 20, "30");
		st[2] = new Student("Joy", 30, "02");

		for(Student st1:st) {		// For each loop
			System.out.println(st1.name +"," +st1.age+","+st1.rollno);
		}
	}

}
