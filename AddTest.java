
public class  AddTest {
	//1) function which add two numbers and return a int
	
	public static int addnum(int m, int n) {
		int plus = m + n;
		return plus;
		}
	public static void main(String[] args) {
		
		
		int result = addnum(4,6);
		System.out.println(result );

			//2 program to reverse string
			String name = "Payal";
		String rev = "";

		

		for (int i = name.length() - 1; i >= 0; i--) {
			 System.out.println(name.charAt(i));

			rev = rev + name.charAt(i);
		}
  
		//3) Multi dimensional array of int  and loop
		
		int [] [] numbers = {
				{24, 25, 26},
				{14, 15, 16},
				{5, 6, 7}};
		for (int [] array : numbers) {
			for(int co : array) {
				System.out.println(co);
			}
		} 
		//4) string array and loop using while loop
		 String [] shoes = {"Nike", "Adidas", "Puma"};
		 int i =0;
		 while (i < shoes.length) {
			 System.out.println(shoes[i]);
			 i++;
		 }
		
		 //5) class vehicle with two properties color and type and 
		 
	
		 Vehicle Hyundai =  new Vehicle("gray","tucson");
		  System.out.println(Hyundai.color);
		  System.out.println(Hyundai.type);
		  Hyundai.start();
		  
		    }
		
		    }
		    class Vehicle{
		      String color;
		      String type;
		      
		      public Vehicle(String color, String type) {
		        this.color= color;
		        this.type = type;
		        
		      }
		      public void start() {
		        System.out.println("hyundai starts");
		      }
	  
	
	}
	


