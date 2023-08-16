
public class day21c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaughterC Yojana = new DaughterC("Bijay","Devkota","Yojana");
		SonC Bikash = new SonC("Bijay","Devkota","Bikash");
		
		Bikash.displaySName();
		Bikash.displayFName();
		
		Yojana.displayFName();
		Yojana.displayDName();
		
		
	}

}

class FatherC {
	
	String firstName;
	String lastName ;
	
	public FatherC(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayFName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}

class SonC extends FatherC {

	String Sname;
	public SonC(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;
		
	}
	
	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}
	
}

class DaughterC extends  FatherC{
	String Dname;
	public DaughterC(String fn, String ln , String dn) {
		super(fn, ln);
		this.Dname = dn;
		
	}
	
	public void displayDName() {
		System.out.println(this.Dname + this.lastName);
	}

}
