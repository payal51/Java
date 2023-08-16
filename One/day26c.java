package One;
interface png{
	
}
interface lng{
	
}
public class day26c {

	public static void main(String[] args) {
		golden rjb = new golden();
		rjb.displaycountry();
		rjb.displaycity();
        rjb.save();
        rjb.loan();
	}

}
//class can implement more than one interface
class golden implements png, lng {
	
	public void displaycountry() {
		System.out.println("In Nepal");
	}
	public void displaycity() {
		System.out.println("Kathmandu");
	}
	public void save () {
		System.out.println("Saving account");
	}
	public void loan () {
		System.out.println("Loan Department");
	}
}