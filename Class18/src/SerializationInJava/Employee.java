package SerializationInJava;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String empName;
	private String mobileNo;
	private String email;
	private String designation;
	
	public Employee(String empName, String mobileNo, String email, String designation) {
		this.empName = empName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.designation = designation;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

	public String getEmpName() {
		return empName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public String getDesignation() {
		return designation;
	}
	
	
	public void display() {
		System.out.println("Name: " +this.empName+"\nMobile No: "+this.mobileNo+"\nEmail: "+this.email+"\nDesignation: "+this.designation);
		
	}	
}
