
public class Day23b {

	public static void main(String[] args) {
	
		AnimalB Rhino = new AnimalB(6);
		 //System.out.println(cat.age);
		Rhino.displayAge();
		int q1 = Rhino.updateage(10);
		System.out.println(q1);
		
		Rhino.displayMessage();

	}

}

class AnimalB {

	private int age;
	public AnimalB(int ag) {
		this.age = ag;
	}

	
	// method returning string
	private String  displayName() {
		return "I am Rhino";
	}

	public void displayAge() {
		System.out.println(this.age);
	}
	
	// methods returning int

	public int updateage(int updatedage) {
		this.age = updatedage;
		return this.age;
	}
	
	public void displayMessage() {
		String msg = displayName();
		System.out.println(msg);
	}

}
