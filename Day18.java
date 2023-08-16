
public class Day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a = 10;
		    int b = 5;
		    
		    //Arthemetic operation
		    
		    System.out.println(a+b);
		    System.out.println(a-b);
		    System.out.println(a*b);
		    System.out.println(a/b);
		    System.out.println(a%b);
		    
		    int x = 20;
		    int y = 15;
		    
		    System.out.println(x+y);
		    System.out.println(x-y);
		    System.out.println(x*y);
		    System.out.println(x/y);
		    System.out.println(x%y);
		    
		    //calling the function
		    
		    Computer(4,6);
		    
		    addA();
		    
		    addB(5,6);
		    addB(4,9);
		    
		    
		    int sum = addC(10,5);
		    System.out.println(sum);
		    //System.out.println(sum*sum);
		    
		  }
		  //Method 2:  
		  
		  public static void Computer(int j, int k) {
		    
		    System.out.println(j+k);
		    System.out.println(j-k);
		    System.out.println(j*k);
		    System.out.println(j/k);
		    System.out.println(j%k);
		    
		  }
		    //function without parameter and without return type
		    
		    public static void addA() {
		    System.out.println(9+9);
		    }
		    
		    //function with parameter and without return type
		    
		    public static void  addB(int e, int f) {
		    System.out.println(e+f);
		    
		    }
		    
		    //function with parameter and with return type
		  
		    public static int addC(int s, int t) {
		    return s+t;
		    
		    
		    
		  }

		
		
		
		
		
		
		
		
		
		
		
		
	}


