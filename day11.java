
public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lastName = "Devkota";
		int totalchar = lastName.length();
		System.out.println(lastName);
		System.out.println(totalchar);
	

	
		String student = "Payal";
		int totalChar = student.length();
		System.out.println(totalChar);
		
		
		String city = "pune";
		int totalC = city.length();
		System.out.println(totalC);
		
		for(int i = 0 ; i < totalC ; i++) {
			System.out.println(i);
		
		}
		
	//	for(int i >= totalC ;i = 0 i++) {
	//	System.out.println(city.charAt(i));
		
		//} 
		// reverse order
		
		for(int i = totalC-1; i>=0; i--) {
			System.out.println(city.charAt(i));
		}
		
		
		// printing  in reverse order
	String city2 = "Punee";
		for (int i=5; i<city2.length()-1; i--){
			   System.out.println(city2.charAt(i));
			   }
			  
			  
			   //printing in reverse order in same line
			
			  
		String city3 = "pune";
		  String reverseCity = "";
		  
		  for(int i = 0; i < city3.length() ; i++){
		   
		  reverseCity = city3.charAt(i) + reverseCity;
		 // System.out.println(reverseCity );
				   }
				      
				      
				    
				      
		}
		
		}

