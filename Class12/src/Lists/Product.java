package Lists;



public class Product {

	private String name;
	private String brand;
	private int qty;
	private int price;
	private double amount;
		
	// Make a constructor
	public Product(String name, String brand, int qty, int price, double amount) {
		this.name = name;
		this.brand = brand;
		this.qty = qty;
		this.price = price;
		this.amount = amount;
	}
	
	// Set method
	public void setname(String name) {
		this.name = name;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public void setqty(int qty) {
		this.qty = qty;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public void setname(double amount) {
		this.amount = amount;
	}
	
	// Get method
	public String getname() {
		return name;
	}
	public String getbrand() {
		return brand;
	}
	public int getqty() {
		return qty;
	}
	public int getprice() {
		return price;
	}
	public double getamount() {
		return amount;
	}
	
	/*
	// Print Method
	public void display() {
		System.out.println("Name: "+name +", Brand: "+brand+", Price: "+price+", Quantity: "+qty+", Amount: "+amount);
	}*/

}
