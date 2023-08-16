
public class day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      calculators a = new calculators();
    		  a.substraction(20, 10);
              a.substraction(20, 10, 5);
             
    		  
	}

}
class calculators {
	public void substraction(int a, int b) {
		System.out.println(a-b);}
	
	public void substraction(int a, int b, int c) {
		System.out.println(a-b-c);
		}
}