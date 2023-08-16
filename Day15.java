
public class Day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 Rojina = new Human2("Rojina Devkota",28);
		Human2 Niran = new Human2("Niran Neupane",32);
		
		
		
	
		System.out.println(Rojina.age);
		System.out.println(Rojina.name);
		
		System.out.println(Niran.age);
		System.out.println(Niran.name);
		
		String a = Niran.talk();
		System.out.println(a);
	}

}

class Human2 {
	
	int age;
	String name;
	
	public Human2(String nm , int ag) {
		this.name = nm;	
		this.age = ag;
	}
	
	public String talk() {
		return "Hello";
	}
	
	

}

class Human1 {
	
	int age;
	String name;
	
	public Human1(String nm , int ag) {
		this.name = nm;	
		this.age = ag;
	}
	
	public String talk() {
		return "Hello";
	}
	
	public void walk() {
		System.out.println("I am walking");
		
	}

}
