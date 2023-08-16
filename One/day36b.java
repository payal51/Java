package One;

import java.util.Arrays;
import java.util.List;

public class day36b {

	public static void main(String[] args) {
		
          Student [] student = {
		  new Student(10, "payal devkota", 1000),
		  new Student(11, "sita paudel", 1100),
		  new Student(12, "adity rajbahak", 1200)
		  };
          
          
         for (int i = 0; i< student.length; i++) {
        	  student[i].displayfullname();}
          
          List<Student> stulist = Arrays.asList(student);
          stulist.stream().forEach(emp -> emp.incrementfee(50));
          
          
          for (int i = 0; i< student.length; i++) {
		System.out.println(student[i].fee);
          }
          
	}

}
class Student {
	int rollno;
	String fullname;
	int fee;
	
	public Student (int rl, String fn, int fe) {
		this.rollno = rl;
		this.fullname = fn;
		this.fee = fe;
	}
	public void displayfullname() {
		System.out.println(this.fullname);}
		
		public void incrementfee(int x) {
			this.fee = this.fee + x;
		}
	}
