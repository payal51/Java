package One;

public class exceptionhandling3 {

	public static void main(String[] args) {
		
		System.out.println("Define a array with values");
		int [] numbers = {11,22,33,44};
		try {
			System.out.println(numbers[0]);
			System.out.println(numbers[5]);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Moving ahead after managing the exception");
	}

}
