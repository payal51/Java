package One;

import java.util.ArrayList;

public class day37b {

	public static void main(String[] args) {
		//Define a array list and loop over it
	//	Defined a hashmap and loop over it
		

		ArrayList<String> fruits  = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("papaya");
		System.out.println(fruits);
		
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
	}

}
