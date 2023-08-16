
public class Testday3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RastriyaBank Bank = new RastriyaBank ("Nepal");
		  System.out.println(Bank.Country);
		  
		  Bank.DisplayMessage();
		  Bank.Loan();
		  Bank.Save();
		  
		  
		  
		  
		  RBanijya Gothatar = new RBanijya("Nepal", "Pepsicola");
		  System.out.println(Gothatar.Country);
		  System.out.println(Gothatar.City);
		  
		  Gothatar.DisplayMessage();
		  Gothatar.Loan();
		  Gothatar.Save();
		  

		 }

		}

		class RastriyaBank{
		 String Country;
		 
		 public RastriyaBank(String Cn) {
		  this.Country = Cn;
		 }
		 
		 public void DisplayMessage() {
		  System.out.println("Welcome to central Bank");
		 }
		 
		 public void Loan() {
		  System.out.println("loan method for RastriyaBank");
		 }
		 
		 public void Save() {
		  System.out.println("Save method for RastriyaBank");
		 }
		}



		class RBanijya extends RastriyaBank{
		 String City;
		 
		 public RBanijya(String CN, String CT) {
		  super(CN);
		  this.City = CT;
		  
		 }
		 
		 public void Loan() {
		  System.out.println("loan method for RBanijya");
		 }
		 
		 public void Save() {
		  System.out.println("Save method for RBanijya");
		 }
		 
		 
		
	}


