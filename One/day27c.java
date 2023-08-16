package One;

public class day27c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipad i7 = new Ipad();
		System.out.println(i7.price);
		int priceD = i7.displayPrice();
		System.out.println(priceD);
		
		Ipad.Processor pro = i7.new Processor();
		//Ipad.Processor pro2 = i7.new Processor();
		
		System.out.println(pro.manufacturer);
		System.out.println(pro.speed());
		
		
		
	}
	
}



class Ipad  {
	
	int price = 250;
	
	
	class Processor {		
		String manufacturer = "intel";
		
		public String speed() {
			return "fast";
		}
			
	}
	public int displayPrice() {
		return  this.price;
	}

}
