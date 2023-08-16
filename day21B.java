
public class day21B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son bikash = new Son("Tika","Devkota","Bijay","Bikash");
		System.out.println(bikash.firstName);
		System.out.println(bikash.lastName);
		System.out.println(bikash.fFirstName);
		System.out.println(bikash.Sname);
		
		bikash.displayFName();
		bikash.displayGName();
		bikash.displaySName();
		
	}

}


class GrandFather {
	String firstName;
	String lastName;
	
	public GrandFather(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void displayGName(){
		System.out.println(this.firstName + this.lastName);
	}
}

class Father extends GrandFather {

	String fFirstName;
	public Father(String firstName, String lastName , String ffn) {
		super(firstName, lastName);
		this.fFirstName = ffn;
	}
	
	public void displayFName(){
		System.out.println(this.fFirstName + this.lastName );
	}
}

class Son extends Father {
	String Sname ;
	public Son(String firstName, String lastName, String ffn ,String ssn) {
		super(firstName, lastName, ffn);
		this.Sname = ssn;
		
	}
		
	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}

}
