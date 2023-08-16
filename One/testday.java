package One;

public class testday {

	public static void main(String[] args) {
		// multilevel Inheritance
		 Baby Samyak = new Baby("Bijay", "Devkota", "Bikash","Samyak");
		    System.out.println(Samyak.firstName);
		    System.out.println(Samyak.lastName);
		    System.out.println(Samyak.DfirstName);
		    System.out.println(Samyak.BfirstName);
		    
		   
		    Samyak.displayGFName();
		    Samyak.displayBfirstName();
		    Samyak.displayDfirstName();
		  }

		}
		class Grandfather{
		  String firstName;
		  String lastName;
		  public Grandfather(String nm, String ln) {
		    this.firstName = nm;
		    this.lastName= ln;
		  }
		  public void displayGFName() {
		    System.out.println(this.firstName + this.lastName);
		  }  
		}
		class Dad extends Grandfather{
		  String DfirstName;
		  public Dad(String nm, String ln ,String dfn) {
		    super(nm,ln);
		    this.DfirstName = dfn;
		  }
		  public void displayDfirstName(){
		    System.out.println(this.firstName + this.lastName);
		  }  
		}
		class Baby extends Dad{
		String BfirstName;  
		  public Baby (String nm, String ln, String fn ,String bfn) {
		    super(nm,ln,fn);
		    this.BfirstName = bfn;    
		  }
		  public void displayBfirstName() {
		    System.out.println(this.BfirstName + this.lastName);
		  }
		}