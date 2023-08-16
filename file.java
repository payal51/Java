
public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print 1 to 5

		int p1 = 1;
		while (p1 <= 5) {
			System.out.println(p1);
			p1++;
		}

		// Printing table of 5 in reverse
		int p2 = 50;
		while (p2 >= 5) {
			System.out.println(p2);
			p2 = p2 - 5;
		}

		// Printing table of 5 in reverse and stops at 20

		int p3 = 50;
		while (p3 >= 5) {
			System.out.println(p3);
			if (p3 == 20)
				break;
		p3 = p3 - 5;
	}
		
		//Print hello 4 time
		
		int p4=1;
		while(p4<=4) {
			System.out.println("Hello");
			p4++;
		}
		
		//print 1 to 9 but not print 2
		
		int p5=1;
		while(p5<=9) {
			if(p5==2) {
				p5++;
				continue;}
				System.out.println(p5);
				p5++;
			}
		  // Table of 6
		
		int p6= 6;
		while(p6<=60) {
			System.out.println(p6);
			p6=p6+6;
		}
		}
		



		
	}


