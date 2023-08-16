package One;

public class day28 {

	public static void main(String[] args) {
		
		//Database a = new Database(); // constructor is private
		Computer db1 = Computer.getInstance();
				db1.getConnetion();
				
			}

		}

		class Computer {
			
			private static Computer dbObject = null;
			private Computer() {
			}
			
			public static Computer getInstance() {
				
				if(dbObject == null) {
					dbObject = new Computer();
				}
				// returns you singleton object
				return dbObject;
			}
				
			public void getConnetion() {
				System.out.println("you are connected to computer");
			}


	}


