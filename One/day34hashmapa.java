package One;
interface Book{
	
	public void Book1();
	public void Book2();
	public void Book3();
	public void Book4();
	public void Book5();
	
	}

 class Goldens implements Book{
	
	public void Book1() {
		System.out.println("science");
	}

	@Override
	public void Book2() {
		// TODO Auto-generated method stub
		System.out.println("math");
	}

	@Override
	public void Book3() {
		// TODO Auto-generated method stub
		System.out.println("english");
	}

	@Override
	public void Book4() {
		// TODO Auto-generated method stub
		System.out.println("nepali");
	}

	@Override
	public void Book5() {
		// TODO Auto-generated method stub
		System.out.println("health");
	}
	
	}
 
  class Star implements Book{

		public void Book1() {
			System.out.println("biology");
		}

		public void Book2() {
			// TODO Auto-generated method stub
			System.out.println("zoology");
		}

		public void Book3() {
			// TODO Auto-generated method stub
			System.out.println("chemistry");
		}

		
		public void Book4() {
			// TODO Auto-generated method stub
			System.out.println("physics");
		}

		
		public void Book5() {
			// TODO Auto-generated method stub
			System.out.println("health and population");
		}
		
	 
 }
public class day34hashmapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Book school;
         school = new Goldens();
         school.Book4();


          school = new Star();
          school.Book5();
	}

}
