
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student shreya = new Student();
		System.out.println(shreya.firstname);
		System.out.println(shreya.lastname);
		System.out.println(shreya.roll);
		shreya.displayname();
		
		
		Teacher pragya = new Teacher();
		System.out.println(pragya.firstname);
		System.out.println(pragya.lastname);
		System.out.println(pragya.roll);
		pragya.displayname();
		pragya.displaysalary();
	}

}
class Student{
	String firstname = "Payal";
	String lastname = "Devkota";
	int roll = 21;
	
	
	public void displayname() {
		System.out.println(this.firstname + this.lastname + this.roll);
	}
}

class Teacher extends Student{
	int salary = 25000;
	public void displaysalary() {
		System.out.println(this.salary);
	}
}