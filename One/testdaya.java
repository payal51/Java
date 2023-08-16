package One;

public class testdaya {

	public static void main(String[] args) {
		//Abstract class
			  
			  Dogs Rosy = new Dogs();
			  Rosy.eat();
			  Rosy.canWalk();
			    
			 }

			}
			abstract class Mammal{
			 abstract void canWalk();
			 public void eat() {
			  System.out.println("Mammal eat plant");
			 }
			}
			 class Dogs extends Mammal{
				public void canWalk() {
			
			  System.out.println("Dogs can make sound like woof woof");
			 }
			 }
			
			
				
				
			

		
			
			
	


