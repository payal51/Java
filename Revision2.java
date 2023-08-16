
public class Revision2 {
	

	public static void main(String[] args) {
			
		int [] numbers = new int[3];
		
		numbers[0]= 11;
		numbers[1]=12;
		numbers[2]=13;
		
		
		// using for loop
		
		for (int i = 0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
		
		// using for each loop
		
		for (int a :numbers) {
		System.out.println(a);
		
		
		
		}
		System.out.println("PAYAL");
		
		//using while
		
		int b1= 0;
		while (b1<numbers.length) {  
			System.out.println(numbers[b1]);
			b1= b1+1;
		}
		
		
		String [] names = new String[2];
		names[0] = "ram";
		names[1] = "sham";
		String [] names2 = {"ram","sham"};
		
		for (int j = 0; j<names.length; j++) {
			System.out.println(names[j]);
			
		
		}
		System.out.println("using for each loop");
		
		// for each
		for (String a :names) {
			System.out.println(a);
		}
		//while loop 
		System.out.println("using while loop");
		
		int  b2 =0;
		while(b2<names.length) {
			System.out.println(names[b2]);
			b2=b2+1;
		}
		}	
}
}
