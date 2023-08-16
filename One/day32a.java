package One;

import java.util.ArrayList;

public class day32a {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		//add
		boolean a = names.add("payal");
		System.out.println(a);
		names.add("sita");
		names.add("sabina");
		names.add("puja");
		System.out.println(names);
		
		// add(position , element)
		names.add(2, "adity");
		System.out.println(names);
		
		// remove
				//    0      1   2       3         4
				//[payal, sita, adity, sabina, puja]
				names.remove(1);
				System.out.println(names);
				names.remove("puja");
				System.out.println(names);
				
				// clear()
				names.clear();
				System.out.println(names);
				names.add("smita");
				names.add("ruja");
				names.add("nilam");
				names.add("yojana");
				names.add("yashna");
				System.out.println(names);
				
				//[smita, ruja, nilam, yojana, yashna]
				
				// set()
				names.set(1,"ishani");
				System.out.println(names);
				
				// contains()
				boolean q1 = names.contains("yashna");
				System.out.println(q1);
				//[smita, ruja, nilam, yojana, yashna]
				// get()
				String eleAtIndex2 = names.get(2);
				System.out.println(eleAtIndex2);
			
				//indexOf()
				int nums = names.indexOf("yojana");
				System.out.println(nums);
				
				
				int numsB = names.indexOf("Puja");
				System.out.println(numsB);
				//
				
				
				
				ArrayList<String> movies  = new ArrayList<>();
				movies.add("antman");
				movies.add("batman");
				movies.add("spiderman");
				movies.add("ironman");
				System.out.println(movies);
				
				String userInput = "antman";
				if(movies.contains(userInput)) {
					System.out.println("Element available");
				}
				else {
					System.out.println("Element not available");
				}
				
				// indexOf()
				
				if(movies.indexOf("antman") >= 0) {
					System.out.println("Element available");
				}
				else {
					System.out.println("Element not available");
				}
				
				
				 ArrayList<String> cities = new ArrayList<>();
				 cities.add("sukedhara");
				 cities.add("gothatar");
				 cities.add("kalanki");
				 cities.add("lazimpat");
				 cities.add("pepsicola");
				 cities.add("sukedhara");
				 
				 
				 System.out.println(cities.size());
				 System.out.println(cities);
				 
				 // [sukedhara, gothatar, kalanki, lazimpat, pepsicola]
				 
				 System.out.println(cities.indexOf("sukedhara"));
				 System.out.println(cities.lastIndexOf("sukedhara"));
				 System.out.println(cities.lastIndexOf("bhaktapur"));
				
	}

}
