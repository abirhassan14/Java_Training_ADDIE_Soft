package MapsAndHashing;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		Map<Integer, String> obj = new TreeMap<Integer, String>();
		obj.put(200, "Tiger");
		obj.put(30, "Lion");
		obj.put(15, "Cat");
		obj.put(85, "Dog");
		obj.put(110, "Cheetah");
		System.out.println(obj);
	}

}
