
public class Day11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String animal = "Rhinoceros";
         
		String rev = "";

		for (int i = 0; i < animal.length(); i++) {
			 System.out.println(i);
			 System.out.println(animal.charAt(i));
			rev = animal.charAt(i) + rev;
			}
		// printing in uppercase
		{String city = "KathMandu";
		String uc = city.toUpperCase();
		System.out.println(uc);		
		}
		
		// printing in lowercase
		String city2 = "LaLITpur";
		String lc1 =city2.toLowerCase();
		System.out.println(lc1);
		
		// printing the length 
		
		String city3 = "Bhaktapur";
		int ct = city3.length();
		System.out.println(ct);   
		
		int ct1 = city2.toLowerCase().toUpperCase(). length();
		System.out.println(ct1);
	}
}
