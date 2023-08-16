
public class day11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city1 = "BiratNagar";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		System.out.println(city1.toUpperCase());
		System.out.println("Welcome to ".toUpperCase() + uc);

		// Program 2

		String city2 = "PoKHara";
		String lc = city2.toLowerCase();
		System.out.println(lc);

		// Program 3

		String city3 = "Kathmandu";
		int toc = city3.length();
		System.out.println(toc);

		// Program 4

		String city4 = "Birgunj";
		int toc2 = city4.toUpperCase().toLowerCase().length();
		System.out.println(toc2);

		// Program 5
		

		String city5 = "Rajbiraj";
		char c = city5.charAt(city5.length() - 1);
		System.out.println(c);

		// Program 6

		String city6 = "chitwan";
		String s2 = city6.substring(1, 3);
		System.out.println(s2);
		
		
		// StartsWith() 
		String city8 = "janakpur";
		boolean s3 = city8.startsWith("j");
		System.out.println(s3);
		
		// EndsWith()
		String city9 = "Lumbini";
		boolean s4 = city9.endsWith("ini");
		System.out.println(s4);
		
		
		
		//replaceFirst()
		String city11 = "I am learning c# and c# is good language";
		String s7 = city11.replaceFirst("c#", "java");
		System.out.println(s7);
		
		//replaceAll()
		String s8 = city11.replaceAll("c#", "java");
		System.out.println(s8);
		
		//replace()
		String s9 = city11.replace("I", "W");
		System.out.println(s9);
		
		//concat()
		String city13 = "pokhara";
		String city14 = "Welcome to ";
		String s10 = city14.concat(city13);
		System.out.println(s10);
		
		// contains()
		
		String city15 = "I am living in california";
		boolean s11 = city15.contains("living");
		System.out.println(s11);
		
		
		// equal()

		String city16 = "simara";
		String city17 = "SIMARA";
		
		boolean s12 = city16.equals(city17);
		System.out.println(s12);
		
		
		//equalIgnoreCase()
		boolean s13 = city16.equalsIgnoreCase(city17);
		System.out.println(s13);
		
		
		
		// trim()
		String city18 = " I am learning c# ";
		System.out.println(city18.length());
		String s14 = city18.trim();
		System.out.println(s14.length());
		
		
		// contains 
		
		String city19 = "I am writing notes";
		String city20 = "NOTES";
		boolean s15 = city19.toUpperCase().contains(city20);
		System.out.println(s15);
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
