
public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[3][4];

		num [0][0] = 1;
		num[0][1] = 2;
		num[0][2] = 3;
		num[0][3] = 4;

		num[1][0] = 10;
		num[1][1] = 20;
		num[1][2] = 30;
		num[1][3] = 40;

		num[2][0] = 200;
		num[2][1] = 300;
		num[2][2] =400;
		num[2][3] = 500;

	//	System.out.println(num[2][1]);
		
		
		for (int i = 0; i < num.length; i++) {
			 System.out.println(i);}
		
		
		int[] arr = num[1]; 
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
			
			
			int[][] numbers2 = {

					{ 6, 5, 7 },
					{ 77, 43, 25 }, 
				{ 59, 2, 8 } 
				};

			for (int k = 0; k < numbers2.length; k++) {
				int[] array = numbers2[k];
				for (int l = 0; l < arr.length; l++) {
					System.out.println(arr[l]);
				}
			}

	}
		}
		}

