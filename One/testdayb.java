package One;
interface EverestBanks{
	public void deposit(int x);
	public void withdraw(int y);
}
public class testdayb {

	public static void main(String[] args) {
		Himalayans Nepal = new Himalayans();
        Nepal.deposit(0);
        Nepal.withdraw(0);
	 
        Prabhuu Nepaltar = new Prabhuu();
        Nepaltar.deposit(0);
        Nepaltar.withdraw(0);
        }

}
class Himalayans implements EverestBanks{
	public void deposit(int x) {
		System.out.println(" this is deposit method from Himalayans Bank");
	}


	
	public void withdraw(int y) {
		System.out.println("this is withdraw method from Himalayans Bank");
		
	}
	
	class Prabhuu implements EverestBank{

		
		public void deposit(int x) {
			System.out.println("This is deposit method from Prabhuu Bank");
			
		}

	
		public void withdraw(int y) {
			System.out.println("This is withdraw method from Prabhuu Bank");
			
		}

	}
}
