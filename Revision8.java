
public class Revision8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits Mango = new Fruits();
		System.out.println(Mango.num);
		System.out.println(Mango.Taste);
		
		
		Mango.num = 200;
		Mango.Taste = "sweet and sour";
		System.out.println(Mango.num);
		System.out.println(Mango.Taste);

		Fruits Litchi = new Fruits();
		Litchi.Taste = "Sweet";
		Litchi.num = 100;
		Litchi.displaytaste();
		
		Fruits1 peach = new Fruits1("sour", 150);
		peach.displaytaste();

		
		Fruits1 grapes = new Fruits1("sour and sweet", 300);
		grapes.displaytaste();

	}

}

class Fruits{
	
	int num;
	String Taste;

	public void displaytaste() {
		System.out.println(this.Taste);
	}

}

class Fruits1 {

	String Taste;
	int num;

	public Fruits1(String ts, int nm) {
		this.Taste = ts;
		this.num = nm;
	}

	public void displaytaste(){
		System.out.println(this.Taste);
	}
	
	
	
	



	}


