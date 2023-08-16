package One;

public class testdayc {

	public static void main(String[] args) {
		//Singleton pattern
		Tablet Galaxy = Tablet.getInstance();
		Galaxy.getConnetion();
		
	}

}

class Tablet {
	
	private static Tablet tbObject = null;
	private Tablet() {
	}
	
	public static Tablet getInstance() {
		
		if(tbObject == null) {
			tbObject = new Tablet();
		}
		
		return tbObject;
	}
		
	public void getConnetion() {
		System.out.println("you are connected to Ipad");
	}




	}


