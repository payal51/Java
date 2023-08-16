package One;

public class exceptionhandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("flower");
		
		try {
			System.out.println(5/0);
		}
		catch(Exception e) {
			System.out.println("Exception managed successully");
			String msg = e.getMessage();
			System.out.println(msg);
		}
		finally {
			System.out.println("I will be executed anyhow");
		}
		
		
		
		
	}

}
