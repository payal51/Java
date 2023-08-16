
public class REVISION9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String states[][] = {

				{ "california", "nevada" }, 
				{ "alabama", "alaska" }, 
				{ "colorado", "connecticut" }

		};

//		System.out.println(states[0]);
//		System.out.println(states[1]);
//		System.out.println(states[2]);
		
		for (int i = 0; i < states.length; i++) {
			String city[] = states[i];
			for (int j = 0; j < city.length; j++) {
				System.out.println(city[j]);
			}

		}
System.out.println("***********");
		// program 2 using while loop
		int h1 = 0;
		while (h1 < states.length) {
			String ci[] = states[h1];
			int h2 = 0;
			while (h2 < ci.length) {
				System.out.println(ci[h2]);
				h2++;
			}
			h1++;

		}
System.out.println("*******");

		// program 3
		String country [][] = {
		{"Nepal","Bhutan"},
		{"India","Pakistan"},
		{"London","Germany"},
		{"America","Australia"}
		};
		
		for(String[] a : country ) {	
			for(String b:a) {
				System.out.println(b);
			}
			
		}
		
		
	}
	}
						
					
					
					
					
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


