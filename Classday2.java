
public class Classday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numT = 25;

		if (numT > 0 && numT <= 6) {
			System.out.println("20 % discount");
		}
		if (numT > 5 && numT <= 15) {
			System.out.println("30 % discount");
		}
		if (numT > 15) {
			System.out.println("40% discount");
		}

		// program2

		int numTa = -29;

		if (numTa > 0 && numTa <= 3) {
			System.out.println("10 % discount");
		} else if (numTa > 3 && numTa <= 13) {
			System.out.println("20 % discount");
		} else if (numTa > 13) {
			System.out.println("30 % discount");
		} else {
			System.out.println("Incorrect input");
		}

		// program 3

		int marks = 99;

		if (marks > 92) {
			System.out.println("Grade A");
		}
		if (marks > 78) {
			System.out.println("Grade B");
		}
		if (marks > 55) {
			System.out.println("Grade C");
		}

		// program 4

		int marksB = 74;

		if (marksB > 80) {
			System.out.println("Grade A");
		} else if (marksB > 77) {
			System.out.println("Grade B");
		} else if (marksB > 63) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail try again");
		}

		// program 5

		int a = 20;
		int b = 10;

		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}

		// program 6

		int x = 50;
		int y = 150;
		int z = 250;

		if (x > y && x > z) {
			System.out.println("x is greater");
		} else if (y > x && y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		

	}
	}
}

