package MapsAndHashing;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> obj = new Hashtable<>();
		//obj.put(null, null);
		//System.out.println(obj);
		// Hashtable does not support null value
		
		obj.put("Tiger", 20);
		obj.put("Lion", 50);
		obj.put("Cat", 90);
		obj.put("Dog", 110);
		System.out.println("First set: "+obj);
		
		Hashtable<String, Integer> obj2 = new Hashtable<>();
		obj2.put("Mango", 25);
		obj2.put("Banana", 59);
		obj2.put("Apple", 70);
		obj2.put("Grape", 310);
		obj.putAll(obj2);	
		// putAll() keyword is used to put all of the new set into previous set
		
		Hashtable<String, Integer> obj3 = new Hashtable<>();
		obj2.put("Alu", 28);
		obj2.put("Peyaj", 96);
		obj2.put("Begun", 34);
		obj2.put("Shosha", 489);
		obj.putAll(obj3);
		
		System.out.println("With 2nd set added" +obj);
		System.out.println("With 3rd set added" +obj2);
		
	}

}
