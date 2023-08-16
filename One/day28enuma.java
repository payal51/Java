package One;
enum month{
	JANUARY, FEBRUARY, MARCH, APRIL, MAY
}

class std1 {
	month exam ;
	
	public std1(month exam) {
		this.exam=exam;
	}
	
	public  void examdate() {
		switch(exam) {
		case JANUARY:
			System.out.println("your exam will be held on january");
			break;
		case FEBRUARY:
			System.out.println("your exam will be held on february");
			break;
		case MARCH:
			System.out.println("your exam will be held on march");
			break;
		case APRIL:
			System.out.println("your exam will be held on april");
			break;
		case MAY:
			System.out.println("your exam will be held on may");
		}
	}
}
public class day28enuma {

	public static void main(String[] args) {

   std1 science = new std1(month.APRIL);
   science.examdate();
	}

}
