
public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print certain value
		int [] numbers = new int[6];
		numbers[0]= 5;
		numbers[1]= 10;
		numbers[2]= 15;
		numbers[3]= 20;
		numbers[4]= 25;
		numbers[5]= 35;
		
		System.out.println(numbers[0]);
		
		//to print certain value in string
		
		String [] veggies = new String[4];
		veggies[0]= "potato";
		veggies[1]= "cauli";
		veggies[2]= "tomato";
		veggies[3]= "chilly";
		
		System.out.println(veggies[3]);
		
		//looping through array
		for(int i = 0; i < veggies.length; i++) {
		System.out.println(veggies[i]);}
		
		//to print in reverse
		
		for (int i =veggies.length-1;i>=0;i--) {
		
		System.out.println(veggies[i]);}
		
		//using while loop
		int num []= {1,8,5,7,11,22};
		int p1 = 0;
		while(p1<num.length) {
			System.out.println(num[p1]);
			p1=p1+1; 
			
			
			
			//printing in reverse using while loop
			int p2= num.length-1;
			while(p2>=0) {
				System.out.println(num[p2]);
				p2=p2-1;
			}
			
			//for each loop
			String[] Icecream = {"Vanilla","Chocolate","Strawberry","Pistachio"};
			for (String flavors :Icecream) {
				System.out.println(flavors);
			}
			
			
			
			// define int array and print all element using for each loop
			int [] num2= {5,1,6,8,9};
			for(int a : num2) {
				System.out.println(a);
			}
		
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


