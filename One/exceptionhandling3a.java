package One;

public class exceptionhandling3a {

	public static void main(String[] args) {
		
		System.out.println("Define a array with values");
		String [] festivals = {"dashain", "tihar","holi","chhath"};
		try {
			System.out.println(festivals[0]);
		System.out.println(festivals[5]);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Moving ahead after managing the exception");
	}

}
