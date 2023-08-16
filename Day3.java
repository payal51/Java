
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // switch
		String city = "Los Angeles";
		switch (city) {
		case "Los Angeles":
			System.out.println("CA");
			
		case "Dallas":
		 System.out.println("TX");
		 
		case "Vegas":
		 System.out.println("NV");
		 
		case "Denver":
		 System.out.println("CO");
		 
		case "Charlotte":
		 System.out.println("NC");
		 
		 default:
			 System.out.println("Wrong City");
			 }
		
		
		
	 
			 
		//Switch with break statement	 
			 
			 
			 String city2 = "Los Angeles";
				switch (city2) {
				
				case "Los Angeles":
					System.out.println("CA");
					
				break;	
				case "Dallas":
				 System.out.println("TX");
				 
				break; 
				case "Vegas":
				 System.out.println("NV");
				 
				break; 
				case "Denver":
				 System.out.println("CO");
				 
				break; 
				case "Charlotte":
				 System.out.println("NC");
				 
				 break;
				 default:
					 System.out.println("Wrong city");
		}
		
		//Multiple value
				 String city3 = "Reno";
					switch (city3) {
					
					case "Los Angeles":
					case "Anaheim":
						System.out.println("CA");
						
					break;	
					case "Dallas":
					case "Plano":
					 System.out.println("TX");
					 
					break; 
					case "Vegas":
					case "Reno":
					 System.out.println("NV");
					 
					break; 
					case "Denver":
					case "Boulder":
					 System.out.println("CO");
					 
					break; 
					case "Charlotte":
					case "Raleigh":
					 System.out.println("NC");
					 
					 break;
					 default:
						 System.out.println("Wrong city");
		
					}
		
		
		
	}

}
