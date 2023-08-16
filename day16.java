
public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human payal = new Human();
		System.out.println(payal.age);
		System.out.println(payal.name);
		payal.walk();
		payal.talk();
		
		payal.age = 30;
		payal.name = "Payal Devkota";
		System.out.println(payal.age);
		System.out.println(payal.name);
		
		
		// creating another object 
		
		Human shreya = new Human();
		System.out.println(shreya.age);
		System.out.println(shreya.name);
		shreya.talk();
		shreya.walk();
		
		shreya.age = 31;
		shreya.name = "Shreya Devkota";
		System.out.println(shreya.age);
		System.out.println(shreya.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}


class Human {
	// properties and methods
	int age;
	String name;
	
	// Methods
	
	public void talk() {
		System.out.println("We are talking ");
	}
	
	public void walk() {
		System.out.println("We are walking");
	}
		

	}


