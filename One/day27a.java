package One;

public class day27a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Honda = new Car("crv","sedane");
		Car Hyundai = new Car("tucson","SUV");
		
		
		Car.Engine i = Honda.new Engine();
		Car.Engine k = Hyundai.new Engine();
		
		i.engineSize();
		k.engineSize();
		
		
	}

}

class Car {

	String carName;
	String CarType;

	public Car(String name, String type) {
		this.carName = name;
		this.CarType = type;
	}

	public void Greet() {
		System.out.println("congrats on new car ".concat(this.carName));
	}
	
	// inner class 
	
	class Engine {
		
		String engineSize;
		
		// Accessing the outer class fields into inner class
		public void engineSize() {
			
			if(Car.this.CarType.equals("sedane")) {
				this.engineSize = "smaller";
				System.out.println(this.engineSize);
			}
			else if(Car.this.CarType.equals("SUV")) {
				this.engineSize = "bigger";
				System.out.println(this.engineSize);
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	


	}


