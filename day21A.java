
public class day21A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TeacherN Binod = new TeacherN("Binod","Pradhan",60,50000);
		
		System.out.println(Binod.firstName);
		System.out.println(Binod.lastName);
		System.out.println(Binod.age);
		System.out.println(Binod.salary);
		
		Binod.displayName();
		Binod.displaySalary();
		
	}

}


class StudentN {
	
	String firstName;
	String lastName ;
	int age;
	
	public StudentN(String fn , String ln , int ag) {
			
		this.firstName  = fn;
		this.lastName  = ln;
		this.age  = ag;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}
class TeacherN  extends StudentN{
	
	int salary;
	public TeacherN(String fn , String ln , int ag, int sal) {
		super(fn,ln,ag);
		this.salary = sal;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
	}


