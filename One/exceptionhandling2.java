package One;

public class exceptionhandling2 {

	public static void main(String[] args) {
		System.out.println("hello");
		
		try {	
			int divideByZero = 5/0;
		    System.out.println("Rest of code in try block");
			System.out.println("Rest of code in try block2");
			System.out.println("Rest of code in try block3");
			System.out.println("Rest of code in try block4");
			
		}
		catch(ArithmeticException e) {
				
			System.out.println(e.getMessage());
		}
		
		System.out.println("bye");
		

	}

}
