
public class testday3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		professor Pragya = new professor("Pragya", "Devkota");
		  System.out.println(Pragya.FirstName);
		  System.out.println(Pragya.LastName);
		  
		  Pragya.DisplayName();
		  
		 }

		}

		class professor{
		 String FirstName;
		 String LastName;
		 
		 public professor(String FN, String LN) {
		  this.FirstName = FN;
		  this.LastName = LN;
		  
		  
		  
		 }
		 
		 public void DisplayName () {
		  System.out.println(this.FirstName + this.LastName);
		 }
		
	}


