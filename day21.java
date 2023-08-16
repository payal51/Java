
public class day21 {

	public static void main(String[] args) {
		
		Studentp payal = new Studentp();
		System.out.println(payal.firstName);
		System.out.println(payal.lastName);
		System.out.println(payal.age);
		
		payal.age = 10;
		payal.firstName = "payal";
		payal.lastName = "devkota";
		
		System.out.println(payal.firstName);
		System.out.println(payal.lastName);
		System.out.println(payal.age);
		payal.displayName();
	
		
		// Creating object of TeacherA
		
		
		TeacherA a = new TeacherA();
		System.out.println(a.salary);
		
		a.firstName = "payal a";
		a.lastName = "devkota d";
		a.age = 34;
		a.salary = 1000;
			
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.age);
		
	
		a.displaySalary();
		a.displayName();
		
		
	}

}


 class Studentp {
	
	
	String firstName;
	String lastName ;
	int age ;
	
	public  void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
	
	
 }

class TeacherA extends Studentp {	
	
	int salary;
	
	public void displaySalary() {
		System.out.println(this.salary);
	
	



	}

}
