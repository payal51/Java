
public class Addition {

	public static void main(String[]args) {
		
		
		// Program 4
		String city = "Los angeles";
		switch (city) {
		case "Los angeles":
			System.out.println("CA");
			break;
		case "sacramento":
			System.out.println("ca");
			break;
		case "Irving":
			System.out.println("TX");
		default:
			System.out.println("incorrect city name");
		}

		// program 3

		int x = 3;
		int y = 9;
		int z = 5;

		if (x > y && x >z) {
			System.out.println("x is greater");
		}

		else if (y > x && y>z) {
			System.out.println("y is greater");
		}

		else {
			System.out.println("z is greater");
		}

		// program 2

		int a = 10;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		

	}
}
