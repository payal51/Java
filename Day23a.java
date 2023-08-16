
public class Day23a {

	public static void main(String[] args) {
	
		Dogname d = new Dogname();
		d.displayMessage();
	}
	
}


class Animal {
	
	public void display() {
		System.out.println("I am animal");
	}
}

class Dogname extends Animal{
	
	public void display() {
		System.out.println("I am Husky");
	}
	
	public void displayMessage() {
		display();
		super.display();
	}

}
//Use of super keyword in java