
public class testday3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Child Bikash = new Child ("Tika", "Devkota", "Bijay", "Bikash");
	    System.out.println(Bikash.firstName);
	    System.out.println(Bikash.lastName);
	    System.out.println(Bikash.PFirstName);
	    System.out.println(Bikash.CFirstName);
	    
	    Bikash.displayGName();
	    Bikash.displayPName();
	    Bikash.displayCName();
	    
	    
	    

	  }

	}

		 class Gpa {
				  String firstName;
				  String lastName;
				  
				  public  Gpa(String fn,String ln) {
				    this.firstName = fn;
				    this.lastName = ln;
				  }
				  
				  public void displayGName() {
				    System.out.println(this.firstName + this.lastName);
				  }
				}



				class Pa extends  Gpa{
				  String PFirstName;
				  
				  public Pa (String fn,String ln, String Pfn) {
				    super (fn,ln);
				    this.PFirstName = Pfn;
				    }
				  
				  public void displayPName(){
				    System.out.println(this.PFirstName);
				  }
				}


				class Child extends Pa {
				  String CFirstName;
				
				  
				  public Child (String fn,String ln,String Pfn,String Cfn) {
				    super (fn,ln,Pfn);
				    this.CFirstName = Cfn;
				    
				  }
				  
				  public void displayCName() {
				    System.out.println(this.CFirstName);
				  }
				}