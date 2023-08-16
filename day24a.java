
public class day24a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile a = new Mobile("black", "iphone14", 2022);
		
		System.out.println(a.color);
		System.out.println(a.model);
	//	 System.out.println(b.chaseNo);private

		

		a.displayColor();
		a.displayChaseNoandModel();
		// a.displayModelNo():

	

		Phone iphone = new Phone("black", "iphone14", 2022, "iphone");
		System.out.println(iphone.color);
		System.out.println(iphone.model);
		System.out.println(iphone.name);

		iphone.displayChaseNoandModel();
		iphone.displayColor();

	
		
		iphone.launchDate(2016);
		iphone.launchDate(2016,"Aug");
		iphone.launchDate(2016,"Aug",12);
		
		
		
	
		iphone.greetingMsg();
		
		int speaker = iphone.displayspeaker();
		System.out.println(speaker);

	}

}

class Mobile {
	String color;
	String model;
	int chaseNo;

	public Mobile(String cl, String md, int chaseNo) {
		this.color = cl;
		this.model = md;
		this.chaseNo = chaseNo;
	}

	public void displayColor() {
		System.out.println(this.color);
	}

	public void displayChaseNoandModel() {
		System.out.println(this.chaseNo);
		this.displayModelNo();
	}

	private void displayModelNo() {
		System.out.println(this.model);
	}
	
	public void greetingMsg() {
		System.out.println("I am your new iphone");
		
	}
	
	protected void greetingMsg2() {
		System.out.println("I am your new iphone msg2");
		
	}

}

class Phone extends Mobile {
	
	String name;
	private int speaker = 3; 

	public Phone(String cl, String md, int chaseNo, String nm) {
		super(cl, md, chaseNo);
		this.name = nm;
	}

	

	public void displayColor() {
	}

	public void displayChaseNoandModel() {
	
		
	}

	public void launchDate(int year) {
		System.out.println(year);
	}

	public void launchDate(int year, String month) {
		System.out.println(year);
		System.out.println(month);
	}
	
	public void launchDate(int year, String month ,int date) {
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	}
	
	public int displayspeaker() {
		return this.speaker;
	}

	

	
	public void greetingMsg() {
		System.out.println("I am your new iphone 14");
		super.greetingMsg();
		this.greetingMsg2();
	}
		

	}


