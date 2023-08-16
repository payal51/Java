package One;

public class exceptionhandling4 {

	public static void main(String[] args) {
		System.out.println("Define a array with values");
		int [] numbers = {01,02,03,04};
		
		
		try {
			
			System.out.println(numbers[0]);
			System.out.println(numbers[5]);
			System.out.println(5/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println("please enter a valid input");
			System.out.println(e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter a valid index for array");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception handled successfully");
		}
		
		System.out.println("Moving ahead after managing the exception");
		

	}

}
