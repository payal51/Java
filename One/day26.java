package One;
interface EverestBank{
	public void deposit(int x);
	public void withdraw(int y);
}
public class day26 {

	public static void main(String[] args) {
		Himalayan Nepal = new Himalayan();
        Nepal.deposit(0);
        Nepal.withdraw(0);
	 
        Prabhuu Nepaltar = new Prabhuu();
        Nepaltar.deposit(0);
        Nepaltar.withdraw(0);
        }

}
class Himalayan implements EverestBank{
	public void deposit(int x) {
		System.out.println(" this is deposit method from Himalayan Bank");
	}


	
	public void withdraw(int y) {
		System.out.println("this is withdraw method from Himalayan Bank");
		
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
