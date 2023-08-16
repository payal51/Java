
public class newday {

	public static void main(String[] args) {
		
		
	
		Iphone A = new Iphone A();
		A.color();
		
		 
		
	{
		class Phone{
	
		String color;
		String model;
		
		
		public Phone(String col, String mod) {
			this.color = col;
			this.model = mod;}
			
		public void displayPhone() {
			System.out.println(this.color);
		}
		class Samsung extends Phone{
			String scolor;
			public Samsung(String scol, String mod) {
				super(scol, mod);
			this.scolor = scol;
			}

			public void displayscolor() {
				System.out.println(this.scolor);
			}
			 class Iphone extends Samsung{

				public Iphone(String scol, String mod) {
					super(scol, mod);
					
				}
				public void displayscolor() {
					System.out.println(this.scolor);
		}
	}
	}

	}}
