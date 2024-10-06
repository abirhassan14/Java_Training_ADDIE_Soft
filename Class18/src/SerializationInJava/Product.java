package SerializationInJava;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String name;
	private String category;
	transient private String brand;
	private int qty;
	private double price;
	
	public Product(String name,String category, String brand, int qty, double price) {
		this.setName(name);
		this.setCategory(category);
		this.setBrand(brand);
		this.setQty(qty);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public  void console() {
		System.out.println("Name: "+this.name+"\nCategory: "+this.category+"\nBrand: "
				+this.brand+"\nQuantity: "+this.qty+"\nPrice: "+this.price);
	}
	
}
