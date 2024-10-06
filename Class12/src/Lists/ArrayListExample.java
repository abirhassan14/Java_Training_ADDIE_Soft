package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//Here we called the entire class instead of any single data type
		//We can call an entire class in list
		List <Product> list = new ArrayList<> ();
		
		// Here using "new Product()" we are creating a new object of "Product" class
		list.add(new Product("Apple", "Fruits", 5, 300, 5*100));
		list.add(new Product("Orange", "Fruits", 10, 200, 5*200));
		list.add(new Product("Lemon", "Fruits", 15, 300, 5*300));
		
		//Replacing the value of Name of Orange & quantity of lemon
		list.get(1).setname("Papaya");
		list.get(2).setqty(50);
		
		for(Product display1: list) {
			
			System.out.println("Name: "+display1.getname() +", Brand: "+display1.getbrand()+", Price: "+display1.getprice()+", Quantity: "+display1.getqty()+", Amount: "+display1.getamount());
		}
		
		// Using the display method
		/*for(Product display1: list) {
			display1.display();
		}*/
		
	}

}
