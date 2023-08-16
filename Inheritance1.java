
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA payal= new StudentA("payal","devkota",567);
		System.out.println(payal.firstName);
		System.out.println(payal.lastName);
		System.out.println(payal.ssn);
		payal.displayName();
		
		
		TeacherC Pragya = new TeacherC("Pragya","neupane",222,35000);
		System.out.println(Pragya.firstName);
		System.out.println(Pragya.lastName);
		System.out.println(Pragya.ssn);
		System.out.println(Pragya.salary);
		
		Pragya.displayName();
		Pragya.displaySalary();
		
	}

}
class StudentA {
	
	String firstName;
	String lastName;
	int ssn;
	
	public  StudentA(String fn , String ln , int ss) {
		
		this.firstName = fn;
		this.lastName = ln;
		this.ssn = ss;
				
	}
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
		}
}


class TeacherC extends  StudentA{
	
	int salary ;
	
	
	public TeacherC(String fn , String ln , int ss ,int sal){
			super(fn,ln,ss);
			this.salary = sal;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
	
	
	
	
	
}